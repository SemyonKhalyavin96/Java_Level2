import java.util.Arrays;

public class Array {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;
    float[] arr;

    public Array(){
        this.arr = new float[SIZE];
        Arrays.fill(arr, 1);
    }

    public void editArray(){
        long a = System.currentTimeMillis();
        calc(this.arr);
        System.out.println(System.currentTimeMillis() - a);
    }

    public void threadEditArray(){
        long a = System.currentTimeMillis();
        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];
        System.arraycopy(this.arr, 0, a1, 0, HALF);
        System.arraycopy(this.arr, HALF, a2, 0, HALF);

        new Thread(() -> calc(a1)).start();
        new Thread(() -> calc(a2)).start();

        System.arraycopy(a1, 0, this.arr, 0, HALF);
        System.arraycopy(a2, 0, arr, HALF, HALF);

        System.out.println(System.currentTimeMillis() - a);
    }

    private void calc(float[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5.0) * Math.cos(0.2f + i / 5.0) * Math.cos(0.4f + i / 2.0));
        }
    }


}
