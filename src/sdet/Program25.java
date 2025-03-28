package sdet;
// Remove White Spaces in a String
public class Program25 {
	public static void main(String[] args) {
		String st=" My   name  is  Vishal  Singh ";
		String Removespace=st.replaceAll("\\s","");
		System.out.println(Removespace);
	}

}
