/**
 * IndividualStoryContent
 */
public class IndividualStoryContent {
    String mainBodyContent;
    String scenarioTitle;
    
    IndividualStoryContent(String mainBodyContent, String scenarioTitle) {
        this.mainBodyContent = mainBodyContent;
        this.scenarioTitle = scenarioTitle;
    }

    public void printOutBody() {
        System.out.println(mainBodyContent);
    }
    
}