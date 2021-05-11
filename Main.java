
public class Main {

	public static void main(String[] args) {
		/*EmailLogger logger =new EmailLogger();
		logger.Log("log mesaj�");*/
		
		BaseLogger[] loggers=new BaseLogger[] {new FileLogger(),new EmailLogger(), new DatabaseLogger()};
        //istenildi�i gibi eklenip ��kar�labilir
		for(BaseLogger logger: loggers) {
        logger.log("log mesaj�");}
	}

}
