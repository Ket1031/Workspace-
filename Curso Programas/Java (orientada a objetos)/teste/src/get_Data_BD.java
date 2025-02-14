import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Scanner;


class get_Data_BD{
    public static void main(String args[]) throws UnsupportedEncodingException{
	
        System.setOut(new PrintStream(System.out, true,"UTF8")); 
        
        Statement stmt = null;
        try{
            String[] nomes = new String[10];
            int i;
            Connection con;            
            con = Connect_DB.conectar();
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Insira o ID do funcionario: ");
            int id_func;
            id_func = sc.nextInt();

            // Query variável
            PreparedStatement myStmt; 
            myStmt = con.prepareStatement("select * from funcionario where ID_Funcionario >= ?");
            myStmt.setInt(1, id_func);
            
            System.out.println(myStmt.toString());
            
            ResultSet rs = myStmt.executeQuery();
            System.out.println("Query variável - traz apenas o funcionário escolhido");
            while(rs.next())
            {
                System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            }
           
            rs.close();
            myStmt.close();
            
            System.out.println("Query fixa - trazer todos os funcionários");
            // Query fixa
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from funcionario");

            i = 0;
            while(rs.next())
            {
                System.out.println(rs.getString(1) +"  "+rs.getString(2)+"  "+rs.getString(3));
                nomes[i] = rs.getString(2); //preencher um vetor com os nomes de funcionários que vêm da BD
                i++;
            }
            
            System.out.println(Arrays.toString(nomes)); // Mostra o vetor de nomes em formato de string
            // Fecho da ligação
            con.close();
    	}
    	catch(SQLException e){
            System.out.println(e.getMessage());
    	}
    }
}