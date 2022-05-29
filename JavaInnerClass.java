package com.company;
class Temple{
     String Name;
     String place;
    public Temple(String Name, String place){
        this.Name = Name;
        this.place = place;
    }
    public String getPlace(){
        return this.place;
    }
    //public void setPlace(String place){
      //  this.place = place;
    //}
    class Details{
        String Detail;
        void setDetail() {
            if (Temple.this.place.equals("pudukkottai")) {
                this.Detail = "Inner Temple Always Good";
            } else {
                this.Detail = "Outer temple is also a Good";
            }
        }
        String getDetail(){
            return this.Detail;
        }
    }
}
class JavaInnerClass{
    public static void main(String[] args) {
        Temple obj = new Temple("inner","pudukkottai");
        Temple.Details obj1 = obj.new Details();
        obj1.setDetail();
        System.out.println("type : "+obj1.getDetail());
        Temple obj2 = new Temple("outer","chennai");
        Temple.Details obj3 = obj2.new Details();
        obj3.setDetail();
        System.out.println("other type : "+obj3.getDetail());
    }
}