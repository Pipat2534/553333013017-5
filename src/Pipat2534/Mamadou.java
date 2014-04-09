package Pipat2534;

public class Mamadou {
	private String name;
	private String position;
	private String friend[];

         public Mamadou() {
        	name = "Mamadou";//ชื่อ
     		position = "RightBack"; //ตำแหน่ง
     		friend = new String[]{"gun","tom","jom"};// ชื่อเพื่อน
     		System.out.println("Squad Liverpool 2013-2014 Premier League \n\n   "
			           + " *******Mamadou Sakho*******");
         }
        
     	public String getName(){			
     		return name;		
     	}
     	public String getPosition(){			
     		return position;		
     	}
     	public String[] getFriend(){			
     		return friend;		
     	}
   }



