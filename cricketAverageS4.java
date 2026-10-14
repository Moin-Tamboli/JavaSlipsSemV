class CricketPlayer {
    String name;
    int no_of_innings;
    int no_of_times_notout;
    int total_runs;
    double bat_avg;

    CricketPlayer(String name, int innings, int notout, int runs) {
        this.name = name;
        no_of_innings = innings;
        no_of_times_notout = notout;
        total_runs = runs;
    }

    static double avg(int runs, int innings, int notout) {
        int outs = innings - notout;

        if (outs == 0)
            throw new ArithmeticException();

        return (double) runs / outs;
    }

    static void sortPlayer(CricketPlayer p[]) {
        for (int i = 0; i < p.length - 1; i++) {
            for (int j = i + 1; j < p.length; j++) {
                if (p[i].bat_avg > p[j].bat_avg) {
                    CricketPlayer temp = p[i];
                    p[i] = p[j];
                    p[j] = temp;
                }
            }
        }
    }

    void display() {
        System.out.println(name + "  " + no_of_innings + "  "
                + no_of_times_notout + "  " + total_runs
                + "  " + bat_avg);
    }

    public static void main(String[] args) {
        CricketPlayer p[] = {
                new CricketPlayer("Sachin", 10, 2, 500),
                new CricketPlayer("Virat", 12, 3, 600),
                new CricketPlayer("Rohit", 10, 1, 450)
        };

        for (int i = 0; i < p.length; i++) {
            try {
                p[i].bat_avg = avg(
                        p[i].total_runs,
                        p[i].no_of_innings,
                        p[i].no_of_times_notout
                );
            } catch (ArithmeticException e) {
                System.out.println("Cannot calculate average");
            }
        }

        sortPlayer(p);

        System.out.println("Players in sorted order:");

        for (int i = 0; i < p.length; i++) {
            p[i].display();
        }
    }
}
