package MINHA_DATA;

public class TestaMinhaData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    MinhaData data = new MinhaData();
	        MinhaData data1 = new MinhaData(25,12,2024);
	        
	        System.out.println("----- DATA DEFAULT -----------");
	        data.imprimirData();

	        //Teste 1: com a data 25/12/2024 avançe 10 dias. Para cada método avancarDia, coloque na sequência o método imprimirData.
	        
	        System.out.println("----- ACRESCENTA DATA -----------");
	        data1.avancarDia(); //1
	        data1.imprimirData();
	        data1.avancarDia(); //2
	        data1.imprimirData();
	        data1.avancarDia(); //3
	        data1.imprimirData();
	        data1.avancarDia(); //4
	        data1.imprimirData();
	        data1.avancarDia(); //5
	        data1.imprimirData();
	        data1.avancarDia();  //6
	        data1.imprimirData();
	        data1.avancarDia(); //7
	        data1.imprimirData();
	        data1.avancarDia(); //8
	        data1.imprimirData();
	        data1.avancarDia(); //9
	        data1.imprimirData();
	        data1.avancarDia(); //10
	        data1.imprimirData();
	        
	        System.out.println("----- DESCONTA DATA -----------");

	        //Teste 2: com a data 05/01/2024 retroceda 10 dias. Para cada método retrocederDia, coloque na sequência o método imprimirData.
	        MinhaData data2 = new MinhaData(05,02,2024);

	        data2.retrocederDia();
	        data2.imprimirData();

	        data2.retrocederDia();
	        data2.imprimirData();

	        data2.retrocederDia();
	        data2.imprimirData();

	        data2.retrocederDia();
	        data2.imprimirData();

	        data2.retrocederDia();
	        data2.imprimirData();

	        data2.retrocederDia();
	        data2.imprimirData();

	        data2.retrocederDia();
	        data2.imprimirData();
	        
	        data2.retrocederDia();
	        data2.imprimirData();

	        data2.retrocederDia();
	        data2.imprimirData();
	        
	        data2.retrocederDia();
	        data2.imprimirData();

	    }


	}

