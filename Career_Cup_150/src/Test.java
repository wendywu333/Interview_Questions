
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long a = (long) Math.pow(Math.pow(10000, 1000),1000);
		long[] B = new long[1000+1];
		B[1] = 1;
        B[2] = 2;
        B[3] = 4;
        B[4] = 8;
        for(int i = 5; i < 1000+1;i++){
            B[i] = B[i-1] + B[i-2] + B[i-3] + B[i-4];
        }
		System.out.println(Math.pow(1000,1000));
	}

}
