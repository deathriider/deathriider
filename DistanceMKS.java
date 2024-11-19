 class Distance {
        double miles;
        Distance(double miles) {this.miles = miles;}
        void travelTime() {
        // Default speed is 60 miles per hour
        double time = miles / 60.0;
        System.out.println("Time to travel " + miles + " miles at 60 mph: " + time + " hours");
        }
       }
       class DistanceMKS extends Distance {
        DistanceMKS(double kilometers) {
        super(kilometers / 1.609); // Convert kilometers to miles
        }
        @Override
        void travelTime() {
        // Override assuming speed is 100 km/s
        double time = miles * 1.609 / 100.0; // Convert miles to kilometers for MKS
        System.out.println("Time to travel " + miles * 1.609 + " kilometers at 100 km/s: " + time + " seconds");
        }
        public static void main(String[] args) {
        Distance dist = new Distance(120);
        dist.travelTime();
        DistanceMKS distMKS = new DistanceMKS(120);
        distMKS.travelTime();
        }
       }
       
