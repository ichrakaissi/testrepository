import java.util.*;
import java.io.*;
public class youm3guez{
	public static void main(String[] args)throws IOException{//darouri men had throws sinn ca marche pas 
		Scanner sc =new Scanner(System.in);
		System.out.println("enter sthg");
		String k= sc.nextLine();
		//ok yes this works to enter sthg and keep it in str 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter anything: ");
		String str = reader.readLine();
		
		//par contre this is what we used in test technique l'autre fois ,def to see 
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;
		while ((line = in.readLine()) != null) {
			//apply method isArmstrong to s 
			//instead of line in next statement print above method outcome
			System.out.println(isArmstrong(Integer.parseInt(line)));//instead of line printed method applied to int of line 
	}
}