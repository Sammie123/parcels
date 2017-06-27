class Parcels {
  public int mLength;
  public int mWidth;
  public int mHeight;
  public Double mWeight;

  public Parcels(int length, int width, int height, Double weight) {
    mLength = length;
    mWidth = width;
    mHeight = height;
    mWeight = weight;
  }

  public int calculateVolume() {
    return mLength * mWidth * mHeight;
  }

  
  public double costToShip(String speed, int distance) {
    if (speed.equals("overnight") && (distance > 100)) {
      return (7.00 + 20.00)* 1.101;
    } else if (speed.equals("standard") && (distance > 100)) {
      return (10.00 + 30.00) * 1.101;
    } else {
      return 0.00;
    }
  }
}
