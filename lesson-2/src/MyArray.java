public class MyArray implements SumOfElements{
    public static char[] symbols = {'a','b','c','d','e','0','1','2','3','4','5','6','7','8','9'};
    public static char[] digits = {'0','1','2','3','4','5','6','7','8','9'};
    private String[][] array;
    private int n;
    private int m;

    public MyArray(int n, int m, char[] ch) throws MyArraySizeException {
        this.n = n;
        this.m = m;
        this.array = createArray(n, m, ch);
    }

    public void printArray(){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(this.array[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private String[][] createArray(int n, int m, char[] ch) throws MyArraySizeException{
        if(n != 4 && m != 4){
            throw new MyArraySizeException("Укажите корректный размер массива: 4х4");
        }
        String[][] arr = new String[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int len = (int)(Math.random()*2) + 1;
                StringBuilder str = new StringBuilder();
                for(int k = 0; k < len; k++){
                    int ind = (int)(Math.random()*ch.length);
                    str.append(ch[ind]);
                }
                arr[i][j] = str.toString();
            }
        }
        return arr;
    }

    public void sumOfElements() throws MyArrayDataException{
        int sum = 0;
        for(int i = 0; i < this.n; i++){
            for(int j = 0; j < this.m; j++){
                try{
                    sum += Integer.parseInt(this.array[i][j]);
                }
                catch(NumberFormatException e){
                    throw new MyArrayDataException("Невозможно привести к целочисленному типу элемент: " + "i = " + i + ", " + "j = " + j);
                }
            }
        }
        System.out.println("Сумма элементов матрицы = " + sum);
    }
}
