import java.util.*;


public class Album {
    public Page[] pages;

    public Album(Page[] pg) {
        this.pages = pg;
    }

    public void changeName(String oldName, String newName) {
        for (int i = 0; i< this.pages.length; i++) {
            for (int j = 0; j < this.pages[i].photos.length; j++) {
                if (Objects.equals(this.pages[i].photos[j].photoName, oldName)) {
                    this.pages[i].photos[j].photoName = newName;
                }
            }
        }
        System.out.println("Photo with a such name wasn`t found");
    }

    public void addPhoto(String name, int pageNum) {
        boolean isExists = false;
        for (int i = 0; i < this.pages.length; i++) {
            if(this.pages[i].pg == pageNum) {
                List<Photo> list = new ArrayList<Photo>();
                for (int j = 0; j < this.pages[i].photos.length; j++) {
                    list.add(new Photo(this.pages[i].photos[j].photoName));
                }
                list.add(new Photo(name));
                this.pages[i].photos = list.toArray(new Photo[0]);
                isExists = true;
            }

        }
        if(!isExists) {
            List<Page> list = new ArrayList<Page>();
            for (int i = 0; i < this.pages.length; i++) {
                list.add(new Page(this.pages[i].photos, this.pages[i].pg));
            }
            List<Photo> list1 = new ArrayList<Photo>();
            list1.add(new Photo(name));
            Photo[] ph = list1.toArray(new Photo[0]);
            list.add(new Page(ph, pageNum));
            this.pages = list.toArray(new Page[0]);
        }
    }

    public void photoAmount() {
        int count = 0;
        for (int i = 0; i < this.pages.length; i++) {
            count += this.pages[i].photos.length;
        }
        System.out.println(count + " photos in album");
    }


}
