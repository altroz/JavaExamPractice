package dataObjectAccessDesignPattern;

public class DAOFactory {
	public static CircleDAO getCircleDAO(String sourceType){
		switch(sourceType){
		case "RDBMSDAO":
			return new RDBMSDAO();
		
		}
		return null;
	}
}
