
public class ProblemOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myList = new double[4];
		myList[0] = 1.1;
		myList[1] = 2.0;	
		myList[2] = 3.3;
		myList[3] = 4.4;
		System.out.println(isStrictlyIncreasing(myList) + " is your answer.");
}
	public static boolean isStrictlyIncreasing(double[] in) {
	boolean var1 = true;
		var1 = false;
		for(int i = 0; i < in.length-1; i++) { if(in[i] > in[i+1])
	else var1 = true; }
return var1;
}
}