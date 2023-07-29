package com.example.information_book;

public class ModelClass {

   private String imagename;
   private String categoryName;

   public ModelClass(String imagename,String categoryName) {
       this.imagename=imagename;
       this.categoryName=categoryName;
   }

   public String getImagename() {
       return imagename;
   }

   public String getCategoryName(){
       return categoryName;
   }
}
