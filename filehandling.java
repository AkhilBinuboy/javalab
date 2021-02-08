import java.io.*;

public class filehandling {
	public static void main(String args[]){
		try{
		FileReader fin_1 = new FileReader("file1.txt");
		FileReader fin_2 = new FileReader("file2.txt");
		FileWriter fout = new FileWriter("file3.txt");
		int i;
		while((i=fin_1.read()) != -1){
		fout.write(i);
		}
		while((i=fin_2.read()) != -1){
		fout.write(i);
		}
		fin_1.close();
		fin_2.close();
		fout.close();
		}
		catch(IOException e){
		System.out.println(e.getMessage());
		}
		}
		}

	


