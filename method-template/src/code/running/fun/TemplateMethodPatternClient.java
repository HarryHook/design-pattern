package code.running.fun;

public class TemplateMethodPatternClient {
	public static void main(String[] args) {
		System.out.println("For MYSQL....");
		ConnectionTemplate template = new MySqLCSVCon();
		template.disableLogging();
		template.run();

	}

}
