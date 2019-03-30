package embridge;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Account account_1 = new Account("firstUser", "firstPassword", "First User", "firstuser@example.com", new ActivityController());
    Account account_2 = new Account("secondUser", "secondPassword", "Second User", "seconduser@example.com", new ActivityController());

    
    account_1.activityController.createPost("Text", "REGULARPOST");
    account_2.activityController.createPost("VideoImage", "TAGGEDPOST");
    account_1.activityController.createPost("TextImageVideo", "TAGGEDPOST");


	}

}
