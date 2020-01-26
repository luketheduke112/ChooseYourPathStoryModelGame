/**
 * IndividualScenario
 */
import java.util.ArrayList;
public class IndividualScenario {
    String scenarioTitleParent;
    public  ArrayList <IndividualOption> options;
    public  ArrayList <IndividualStoryContent> storyBlurbs;

    IndividualScenario(String scenarioTitleParent) {
        this.scenarioTitleParent = scenarioTitleParent;
        this.options = new ArrayList<IndividualOption>();
        this.storyBlurbs = new ArrayList<IndividualStoryContent>();
    }

    
    

    


    
}