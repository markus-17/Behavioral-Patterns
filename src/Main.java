import com.mariuspurici.fileexplorer.*;
import com.mariuspurici.texteditor.*;
import com.mariuspurici.audioplayer.*;
import com.mariuspurici.graphicalapplication.*;
import com.mariuspurici.dashboardapplication.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("+---------------------------------------------------------+");
        System.out.println("| Testing the text editor application --- Command Pattern |");
        System.out.println("+---------------------------------------------------------+");
        Application textEditorApp = new Application(new Editor("Hello World  !!!"));
        textEditorApp.display();
        textEditorApp.executeCopyShortcut(6, 11);
        textEditorApp.pressPasteButton(12, 12);
        textEditorApp.display();
        textEditorApp.executeCutShortcut(0, 6);
        textEditorApp.display();
        textEditorApp.pressPasteButton(12, 12);
        textEditorApp.display();
        textEditorApp.pressUndoButton();
        textEditorApp.display();
        textEditorApp.executeUndoShortcut();
        textEditorApp.display();
        textEditorApp.pressUndoButton();
        textEditorApp.display();

        System.out.println();
        System.out.println("+--------------------------------------------------------+");
        System.out.println("| Testing the audio player application --- State Pattern |");
        System.out.println("+--------------------------------------------------------+");
        ArrayList<String> playlist = new ArrayList<String>();
        playlist.add("Song 1");
        playlist.add("Song 2");
        playlist.add("Song 3");
        playlist.add("Song 4");
        AudioPlayer audioPlayer = new AudioPlayer(playlist);
        audioPlayer.clickPlay();
        audioPlayer.clickPlay();
        audioPlayer.clickPlay();
        audioPlayer.clickNext();
        audioPlayer.clickNext();
        audioPlayer.clickNext();
        audioPlayer.clickNext();
        audioPlayer.clickPrevious();
        audioPlayer.clickPrevious();
        audioPlayer.clickLock();
        audioPlayer.clickPlay();
        audioPlayer.clickNext();
        audioPlayer.clickPrevious();
        audioPlayer.clickLock();

        System.out.println();
        System.out.println("+-----------------------------------------------------------------------+");
        System.out.println("| Testing the graphical application --- Chain of Responsability Pattern |");
        System.out.println("+-----------------------------------------------------------------------+");
        Dialog dialog = new Dialog("This is a wiki page", null);
        dialog.add(new Button("This is the help text of a button"));
        dialog.add(new Panel(null, "This is the help text of the Panel"));
        dialog.showHelp();
        dialog.children.get(0).showHelp();
        dialog.children.get(1).showHelp();

        System.out.println();
        System.out.println("+--------------------------------------------------------+");
        System.out.println("| Testing the DashBoard application --- Observer Pattern |");
        System.out.println("+--------------------------------------------------------+");
        DataSource source1 = new DataSource();
        DataSource source2 = new DataSource();
        DashBoard dashBoard1 = new DashBoard(1, source1);
        DashBoard dashBoard2 = new DashBoard(2, source1);
        DashBoard dashBoard3 = new DashBoard(3, source2);
        source1.setState("\u001B[32mNew source of data for source1\u001B[0m");
        source1.notifyObservers();
        System.out.println("---- ---- ---- ----");
        source2.setState("\u001B[32mAnother new source of data for source2\u001B[0m");
        source2.notifyObservers();

        System.out.println();
        System.out.println("+------------------------------------------------------------+");
        System.out.println("| Testing the File Explorer application --- Iterator Pattern |");
        System.out.println("+------------------------------------------------------------+");
        Directory y2021 = new Directory("2021");
        y2021.addChild(new File("first_quarter.json"));
        y2021.addChild(new File("second_quarter.csv"));
        Directory y2022 = new Directory("2022");
        y2022.addChild(new File("first_quarter.csv"));
        y2022.addChild(new File("second_quarter.json"));
        Directory sales = new Directory("sales");
        sales.addChild(y2021);
        sales.addChild(y2022);
        Directory root = new Directory("root");
        root.addChild(sales);
        root.addChild(new File("config_file.csv"));
        Iterator fileIterator = new FileIterator(root);
        while(!fileIterator.isDone()) {
            System.out.print(fileIterator.next() + " ");
        }
        System.out.println();
        fileIterator = new CsvFileIterator(root);
        while(!fileIterator.isDone()) {
            System.out.print(fileIterator.next() + " ");
        }
    }
}
