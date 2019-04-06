package embridge;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Account account_1 = new Account("firstUser", "firstPassword", "First User", "firstuser@example.com", new ActivityController());
    Account account_2 = new Account("secondUser", "secondPassword", "Second User", "seconduser@example.com", new ActivityController());

    
    Post textPost = account_1.activityController.createPost("TextImage", "REGULARPOST");
    /*Post videoImagePost = account_2.activityController.createPost("VideoImage", "TAGGEDPOST");
    Post textImnageVideoPost = account_1.activityController.createPost("TextImageVideo", "TAGGEDPOST");*/
    System.out.println("Likes: " +  textPost.getLikeCount() + " Dislikes: "+ textPost.getDislikeCount());
    account_1.activityController.reactToPost(textPost, "Like");
    account_2.activityController.reactToPost(textPost, "DisLike");

	}

}
