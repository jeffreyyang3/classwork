//Jeffrey Yang
import java.io.*;
import java.util.Scanner;

class FileReverse{
	public static void main(String[] args) throws IOException{
		Scanner in = null;
		PrintWriter out = null;
		String line = null;
		String[] token = null;
		// check number of command line arguments is 2
		if(args.length != 2){
			System.out.println("Usage: FileReverse <input file> <output file>");
			System.exit(1);
		}

		// open filesbn
		in = new Scanner(new File(args[0]));
		out = new PrintWriter(new FileWriter(args[1]));

		// read lines from in, extract and print tokens from each line
		while(in.hasNextLine()){

			// trim leading and trailing spaces, then add one trailing space so
			// split works on blank lines
			line = in.nextLine().trim() + " ";

			// split line around white space
			token = line.split("\\s");
			for(int i = 0; i < token.length; i++){
				out.println(stringReverse(token[i],token[i].length()));
			}
		}
		in.close();
		out.close();
	}

	public static String stringReverse(String s, int n){
		String x = "";
		if(n == 0){
			return "";
		}
		else if(n > 0){
			x = s.charAt(n-1) + stringReverse(s, n-1)  ;
		}
		return x;


	}
}

