
package module_07.practise_work.Template;

public abstract class ReportGenerator {

    public final void generateReport(){

        collectData();
        formatData();
        createHeader();

        if(customerWantsSave()){
            saveReport();
        }

        System.out.println("Report generated\n");
    }

    abstract void collectData();
    abstract void formatData();
    abstract void createHeader();

    void saveReport(){
        System.out.println("Saving report...");
    }

    boolean customerWantsSave(){
        return true;
    }
}
