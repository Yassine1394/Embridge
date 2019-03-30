// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package embridge;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/************************************************************/
/**
 * 
 */
public abstract class Post {
	/**
	 * 
	 */
	private int post_id;
	private Date creationDate;
	private List<ContentType> content = new ArrayList<ContentType>();
	private int likeCount;
	private int dislikeCount;
	
	
	public Post() {
		
	}

	/**
	 * 
	 * @param c 
	 */
	public void addContent(ContentType c) {
		
		this.content.add(c);
	}

	/**
	 * 
	 */
	public void showContent(){
		for (ContentType c: content) {
			System.out.println("ContenType: " + c.nameContentType() + "\n" + c.createContent());
		}
	}

	/**
	 * 
	 */
	public abstract String postType();

}
