package Datevalid;


public class ConsoleInput {
	public static int getInt() {
		try{
			byte[] input = new byte[100];
			int len=System.in.read(input);
			byte[] finalInput=new byte[len-2];
			
			System.arraycopy(input, 0, finalInput, 0, len-2);
			
			String objString1=new String(finalInput);
			//System.out.println("Input is "+objString1);
			int num1=Integer.parseInt(objString1);
			return num1;
		}
		catch(Exception e) {
			System.out.println("Error Occured !!!!");
			e.printStackTrace();
		}
		return -1;
	}
}

