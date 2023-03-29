class Main {
  public static void main(String[] args) {
    int i,a;
    for(i=0;i<4;i++)
      {
        for(a=i;a<4;a++)
          {
            System.out.print("*");
          }
        System.out.print("\n");
      }
    for(i=0;i<4;i++)
      {
        for(a=0;a<=i;a++)
          {
            System.out.print("*");
          }
        System.out.print("\n");
      }
  }
}