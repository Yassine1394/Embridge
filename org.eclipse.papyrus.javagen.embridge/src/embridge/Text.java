// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package embridge;

import embridge.ContentType;

/************************************************************/
/**
 * 
 */
public class Text implements ContentType {

	private String content;
	
    public String nameContentType() {
		
		return "Text";
	}
	
	public Text(String content) {
		
		this.content = content;
	}
	@Override
	public String createContent() {
		// TODO Auto-generated method stub
		return content;
	}
}