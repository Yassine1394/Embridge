// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package embridge;

import embridge.Post;

/************************************************************/
/**
 * 
 */
public class PostFactory {
	/**
	 * 
	 */
	  public Post getPost(String postType){
	      if(postType == null){
	         return null;
	      }		
	      if(postType.equalsIgnoreCase("REGULARPOST")){
		         System.out.println("This is a regular post");
                 return new RegularPost();
	         
	      } else if(postType.equalsIgnoreCase("TAGGEDPOST")){
	         System.out.println("This is a tagged post");
	    	  return new TaggedPost();
	        
	      }
	      return null;
	   }
}

