 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.paint.Color;
import javafx.scene.image.WritableImage;
import javafx.scene.effect.ColorAdjust;
import java.util.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javafx.embed.swing.SwingFXUtils; 
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class imageWrite extends Application {
    private static ArrayList <Color[]> hm = new ArrayList<>();
    private static int index = 1;
    private static HashMap<Image, Double> sizes = new HashMap<>();
    private static double maxWidth;
    private static double maxHeight;
    @Override
    public void start(Stage primaryStage) {
     
           
        Random rnd = new Random(System.currentTimeMillis());
        String polku = "C:/Users/marti/OneDrive/Tiedostot/imageproject/imageproject/imageprojecttemplates";
        // Create Image and ImageView objects
        Image image = new Image("https://cdn.spacetelescope.org/archives/images/screen/heic1509a.jpg");
        ImageView imageView = new ImageView();
        imageView.setImage(image);
        
        ArrayList<String> urls = new ArrayList<>();

        //urls.add("https://cdn.spacetelescope.org/archives/images/screen/heic2018b.jpg";); 
        //urls.add("https://cdn.spacetelescope.org/archives/images/screen/heic1608a.jpg");
       
        //urls.add("https://cdn.spacetelescope.org/archives/images/screen/opo0328a.jpg");

        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/potw2108a.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/potw1345a.jpg");
       /* urls.add("https://images.wallpaperscraft.com/image/single/mountain_summit_clouds_120918_2560x1600.jpg");
        //urls.add("https://images.wallpaperscraft.com/image/single/mountain_top_peak_clouds_sky_stones_distance_height_dreams_61610_1280x720.jpg");
        urls.add("https://images.wallpaperscraft.com/image/single/mountain_peak_snow_133763_3840x2160.jpg");
        urls.add("https://images.wallpaperscraft.com/image/single/mountain_stones_top_126223_1920x1200.jpg");
        urls.add("https://images.wallpaperscraft.com/image/single/mountain_snowy_fjord_151706_1920x1200.jpg");
        urls.add("https://images.wallpaperscraft.com/image/single/mountain_peak_snowy_130941_1920x1200.jpg");
        urls.add("https://images.wallpaperscraft.com/image/single/mountain_sky_sunset_125061_1920x1200.jpg");
        urls.add("https://images.wallpaperscraft.com/image/single/mountain_forest_snow_201775_1920x1200.jpg");*/
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/heic0817a.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/heic0702a.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/heic1302a.jpg");
        
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/heic1811a.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/heic0910e.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/heic1118a.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/heic1819a.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper4/potw2119a.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/potw1944a.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/heic0206d.jpg"); 
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/heic1509f.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/opo0511a.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/heic1811a.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/heic1503a.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/heic0911b.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/potw1926a.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/potw1731a.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/heic0711a.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/heic1901a.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/potw1929a.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/heic1517a.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/potw1348a.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/potw1350a.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/potw1923a.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/potw2133a.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/heic0604d.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/potw2040a.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/potw1520a.jpg");
        urls.add("https://cdn.spacetelescope.org/archives/images/wallpaper5/potw1201a.jpg");

        //"normal" pictures
        /*urls.add("https://image.shutterstock.com/image-photo/dark-blue-navy-sapphire-color-600w-1687941274.jpg");
        urls.add("https://image.shutterstock.com/image-photo/wooden-comfortable-chair-isolated-on-600w-521053675.jpg");
        urls.add("https://image.shutterstock.com/image-photo/beautiful-woman-wearing-stylish-sunglasses-600w-1725716317.jpg");
        urls.add("https://image.shutterstock.com/image-photo/car-driving-fast-motion-on-600w-2138089971.jpg");*/
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to submit your images as url? (Y/N)");
        String res = scan.nextLine();
        boolean submitOrNo;

        if(res.equals("y")){
            submitOrNo = true;
        }
        else{
            submitOrNo = false;
        }


        System.out.println("How many pictures do you want to combine? (max "+urls.size()+")");
        

        int input = scan.nextInt();
        scan.nextLine();
        
        ArrayList<String> finalUrls = new ArrayList<>();
        if(!submitOrNo){
        //newImage("https://cdn.spacetelescope.org/archives/images/screen/heic1909a.jpg"); //Background space
        for(int i = 1; i<=input; i++ ){
         
            int getThis = rnd.nextInt(urls.size());
            //getThis = i; //for testing
            System.out.println("Index: " + getThis);
            image = new Image(urls.get(getThis));
            sizes.put(image, image.getHeight()*image.getWidth());
            //newImage(urls.get(getThis));
            finalUrls.add(urls.get(getThis));
            urls.remove(getThis);
           // System.out.println(i);
        }
    }
    else{
        urls.clear();
        for(int i = 1; i<=input; i++){
            System.out.println("Give URL");
            String url = scan.nextLine();
            image = new Image(url);
            sizes.put(image, image.getHeight()*image.getWidth());
            finalUrls.add(url);
        }
    }

        double minsize = image.getHeight()*image.getWidth();
        for(Image im : sizes.keySet()){
            if(sizes.get(im)< minsize){
                image = im;
                minsize = sizes.get(im);
            }
        }

        maxHeight = image.getHeight();
        maxWidth = image.getWidth();

        for(String s: finalUrls){
            newImage(s);
        }

        
        // Create WritableImage
         WritableImage wImage = new WritableImage(
                 (int)image.getWidth(),
                 (int)image.getHeight());
         PixelWriter pixelWriter = wImage.getPixelWriter();
         
    
     

        ArrayList<Color> colorList = new ArrayList<>(hm.get(0).length);
        int i = 0;
        double r = 0;
        double g = 0;
        double b = 0;
        double hue = 0;
        double satur = 0;
        double bright = 0;

        for(int y = 0; y< image.getHeight(); y++){
            for(int x = 0; x<image.getWidth(); x++){

                for(Color[] colorArray : hm){
                Color c = colorArray[i];
                hue = hue + c.getHue();
                satur = satur + c.getSaturation();
                //System.out.println("saturation on pixel: " + c.getSaturation());
                bright = bright + c.getBrightness();

                r = r+ c.getRed();
                g = g+ c.getGreen();
                b = b+ c.getBlue();
                colorList.add(c);
                }
                if(hue != 0)
                hue= hue/hm.size();
                if(satur != 0)
                //System.out.println("satur " + satur +"/" +hm.size());
                satur = satur/hm.size();
                if(bright != 0)
                bright = bright/hm.size();

                if(r != 0)
                r = r/hm.size();
                if(g != 0)
                g = g/hm.size();
                if(b!=0)
                b = b/hm.size();
               // Color d = colorList.get(rnd.nextInt(colorList.size()));
               Color d = Color.color(r, g, b, 1);
               d.saturate();
               d.saturate();
               
                pixelWriter.setColor(x,y,d);
                i++;
                colorList.clear();
                hue = 0;
                satur = 0;
                bright = 0;
                r = 0;
                b = 0;
                g = 0;

            }
           
        }
        // Display image on screen
        

        imageView.setImage(wImage);
        ColorAdjust colorAdjust = new ColorAdjust();
        colorAdjust.setBrightness(0.1);
        colorAdjust.setContrast(0.05);
        colorAdjust.setSaturation(0.15);

        //imageView.setEffect(colorAdjust);
        HBox hbox = new HBox();
        Button save = new Button("save");
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
               savePic(wImage);
            }
        };
        save.setOnAction(event);
        hbox.getChildren().add(save);
        StackPane root = new StackPane();
        //root.onMouseClickedProperty(savePic(wImage));
        root.getChildren().add(imageView);
        root.getChildren().addAll(hbox);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Image Write Test");
        primaryStage.setScene(scene);
        primaryStage.show();
       // WritableImage snap = scene.snapshot(null);
        //System.out.print("Do you want to save the picture?");
        //String response = scan.nextLine();
        
        //savePic(wImage);
        
        
    
    }
 
    public static void main(String[] args) {
        launch(args);
    }

    public static void savePic(Image image){
        File outFile = new File("snapshot_"+ System.currentTimeMillis() + ".png");
        try {
            ImageIO.write(SwingFXUtils.fromFXImage(image, null), "png", outFile);
                    System.out.println("Snapshot " + outFile.getName() + " saved");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    
    }
    

    public static void getColors(Image image){

        int width;
        int height;

        
        
            width = (int)image.getWidth();
            height = (int)image.getHeight();

        Color colorArray[] = new Color[width*height];
       
        // Obtain PixelReader
        PixelReader pixelReader = image.getPixelReader();
        System.out.println("Image Width: "+image.getWidth());
        System.out.println("Image Height: "+image.getHeight());
        System.out.println("Pixel Format: "+pixelReader.getPixelFormat());

        int i = 0;
        for(int readY=0;readY<height;readY++){
            for(int readX=0; readX<width;readX++){
                Color color = pixelReader.getColor(readX,readY);
                colorArray[i] = color; 
                i++;
            }
        }

        addHM(colorArray);
        index++;
    }

    public synchronized static void addHM(Color[] e){
        hm.add(e);
    }

    public static Image newImage(String url){

        Image image2 = new Image(url, maxWidth, maxHeight, true, true); //TODO 
        
        getColors(image2);
       
        return image2;
    }
}