
    public class IndividualOption {
        int scenarioIndividualID; 
        String mainContent;
        Boolean selected;
        String scenarioTitle;
    
        IndividualOption(int scenarioIndividualID, String mainContent, Boolean selected, String scenarioTitle) {
            this.scenarioIndividualID = scenarioIndividualID;
            this.selected = selected;
            this.mainContent = mainContent;
            this.scenarioTitle = scenarioTitle;
        }
    
        public void printOption(){
            System.out.println("Type "+ scenarioIndividualID + " to: \n" + mainContent);
        }

    }