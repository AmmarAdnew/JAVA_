class box_size{
    double width,height,length;

    // box_size(double x, double y, double z){
    //     this.width                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      = x;
    // }

    public void volume(){
        System.out.println(width * height * length);
    }
}

public class box {
    public static void main(String [] args){
        box_size box1 = new box_size();
        box1.height = 4;
        box1.width = 5;
        box1.length = 6;
        box1.volume();
        System.out.println(box1.volume());

        // 

        // box_size1 box2 = new box_size1(1,2,3);
        
    }
}


// class box_size1{

//     box_size1(double width, double height , double length){
//         double width = x, height = y, length = z;
//         void volume(width , height , length){ 
//             System.out.println(width * height * length);
//         }
//     }
// }