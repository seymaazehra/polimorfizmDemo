
public class Main {

	public static void main(String[] args) {
		/*EmailLogger logger =new EmailLogger();
		logger.Log("log mesajý");*/
		
		BaseLogger[] loggers=new BaseLogger[] {new FileLogger(),new EmailLogger(), new DatabaseLogger()};
        //istenildiði gibi eklenip çýkarýlabilir
		for(BaseLogger logger: loggers) {
        logger.log("log mesajý");}
	}

}
