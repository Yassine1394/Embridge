// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package embridge;

import embridge.ContentType;

/************************************************************/
/**
 * 
 */
public class Image implements ContentType {

	private String image_url;
	
   public String nameContentType() {
		
		return "Image";
	}
	
	public Image(String image_url) {
		
		this.image_url = image_url;
	}
	@Override
	public String createContent() {
		// TODO Auto-generated method stub
        return image_url;		
	}
}
