
// Declare and construct two objects (h1, h2) from the class HLine
int size = 100*100;
        dot h1[] = new dot[size];
        ArrayList<Integer> he =  new ArrayList<Integer>();
        void setup()
        {
        size(1000, 1000);
        frameRate(30);
        for(int x = 0 ; x<100;x++){
        for (int y = 0 ; y<100;y++){
        h1[(x*100 )+ y] = new dot();
        }
        }
        for (int i = 0 ; i <size ;i++){
        int le = 0;
        for (int e = 0 ; e < size;e++){

        if (le < h1[e].entropy()&& h1[e].til == 0){
        le = h1[e].entropy();
        he.clear();
        }
        if (le == h1[e].entropy()&& h1[e].til == 0){
        he.add(e);
        }

        }
        int lp =he.get(int(random(he.size())));
        h1[lp].update(lp);
        }
        }

        void draw() {
        background(204);
        noStroke();
        for(int x = 0 ; x<100;x++){
        for (int y = 0 ; y<100;y++){
        switch (h1[(x*100 )+ y].til){
        case 1:{
        fill( color(0, 100, 0));
        break;
        }
        case 2:{
        fill( color(100, 100, 0));
        break;
        }
        case 3:{
        fill( color(50, 50, 100));
        break;
        }
        case 4:{
        fill( color(100, 100, 100));
        break;
        }
        case 5:{
        fill( color(0, 0, 100));
        break;
        }
        }
        square(x*10, y*10, 10);
        }
        }
        }


class dot {
    ArrayList<Integer> st =  new ArrayList<Integer>();// 1 - grass 2-sand 3- water 4 - mountains 5 - deep water
    int til = 0;
    dot () {
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
    }
    void update(int pos) {

        int lst = st.get(int(random(st.size())));
        til = lst;
        switch (lst) {
            case 1 :{
                modf(pos,3);
                modf(pos,5);
                break;
            }
            case 3:{
                modf(pos,1);
                modf(pos,4);
                break;
            }
            case 4:{
                modf(pos,2);
                modf(pos,3);
                modf(pos,5);
                break;
            }
            case 2:{
                modf(pos,4);
                modf(pos,5);
                break;
            }
            case 5:{
                modf(pos,1);
                modf(pos,2);
                modf(pos,4);
                break;
            }
            default:

        }

        st.clear();
    }
    int entropy(){

        return(6-st.size());

    }
    void rm(int i){
        if (st.contains(i)){
            st.remove(st.indexOf(i));
        }

    }
}
    void clamp(int i,int a){
        if (i > 0 && size > i){
            h1[i].rm(a);
        }
    }
    void modf(int i,int a){
        clamp(i-1,a);
        clamp(i+1,a);
        clamp(i-100,a);
        clamp(i+100,a);
    }