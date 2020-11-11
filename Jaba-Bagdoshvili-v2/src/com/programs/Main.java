import java.io.File;
import java.nio.*;

public class Main {

    public static void main(String[] args) {
        String path="/Users/jababagdoshvili/IdeaProjects";
        File file=new File(path);
        int fileCounter=0;
        int dirCounter=0;
        String str[]=file.list();

        for(String s: str) {
            File fls=new File(file,s);
            if(fls.isFile()){
                fileCounter++;
            }
            if(fls.isDirectory()) {
                dirCounter++;
            }
            System.out.println(fls);
        }
        System.out.println("სულ ფაილების რაოდენობა:" + fileCounter + " " + "სულ დირექტორია:" + dirCounter);
    }

}
