package at.mschreiber.aventofcode;

public class Day14Exercise1 {
  
  public static void main(String[] args) {
    SandMap sandMap = new SandMap();
    String[] lines = input.split("\r\n");
    for (String line : lines) {
      String[] paths = line.split(" -> ");
      for (int i=0; i<paths.length-1; i++) {
        sandMap.addMapEntry(paths[i], paths[i+1]);
      }
    }

 
    sandMap.sand();
    
  // sandMap.print();
  }

  public static String input = "512,122 -> 512,118 -> 512,122 -> 514,122 -> 514,120 -> 514,122 -> 516,122 -> 516,121 -> 516,122\r\n"
      + "503,45 -> 503,41 -> 503,45 -> 505,45 -> 505,43 -> 505,45 -> 507,45 -> 507,37 -> 507,45 -> 509,45 -> 509,35 -> 509,45 -> 511,45 -> 511,37 -> 511,45\r\n"
      + "516,125 -> 516,129 -> 515,129 -> 515,136 -> 526,136 -> 526,129 -> 519,129 -> 519,125\r\n"
      + "503,45 -> 503,41 -> 503,45 -> 505,45 -> 505,43 -> 505,45 -> 507,45 -> 507,37 -> 507,45 -> 509,45 -> 509,35 -> 509,45 -> 511,45 -> 511,37 -> 511,45\r\n"
      + "512,122 -> 512,118 -> 512,122 -> 514,122 -> 514,120 -> 514,122 -> 516,122 -> 516,121 -> 516,122\r\n"
      + "511,86 -> 515,86\r\n"
      + "485,22 -> 489,22\r\n"
      + "508,62 -> 508,56 -> 508,62 -> 510,62 -> 510,52 -> 510,62 -> 512,62 -> 512,60 -> 512,62 -> 514,62 -> 514,58 -> 514,62 -> 516,62 -> 516,55 -> 516,62\r\n"
      + "509,150 -> 513,150\r\n"
      + "516,65 -> 516,69 -> 508,69 -> 508,74 -> 521,74 -> 521,69 -> 520,69 -> 520,65\r\n"
      + "503,45 -> 503,41 -> 503,45 -> 505,45 -> 505,43 -> 505,45 -> 507,45 -> 507,37 -> 507,45 -> 509,45 -> 509,35 -> 509,45 -> 511,45 -> 511,37 -> 511,45\r\n"
      + "494,157 -> 494,159 -> 491,159 -> 491,167 -> 503,167 -> 503,159 -> 499,159 -> 499,157\r\n"
      + "494,157 -> 494,159 -> 491,159 -> 491,167 -> 503,167 -> 503,159 -> 499,159 -> 499,157\r\n"
      + "512,139 -> 512,142 -> 509,142 -> 509,145 -> 521,145 -> 521,142 -> 517,142 -> 517,139\r\n"
      + "512,139 -> 512,142 -> 509,142 -> 509,145 -> 521,145 -> 521,142 -> 517,142 -> 517,139\r\n"
      + "503,45 -> 503,41 -> 503,45 -> 505,45 -> 505,43 -> 505,45 -> 507,45 -> 507,37 -> 507,45 -> 509,45 -> 509,35 -> 509,45 -> 511,45 -> 511,37 -> 511,45\r\n"
      + "503,45 -> 503,41 -> 503,45 -> 505,45 -> 505,43 -> 505,45 -> 507,45 -> 507,37 -> 507,45 -> 509,45 -> 509,35 -> 509,45 -> 511,45 -> 511,37 -> 511,45\r\n"
      + "494,24 -> 498,24\r\n"
      + "516,65 -> 516,69 -> 508,69 -> 508,74 -> 521,74 -> 521,69 -> 520,69 -> 520,65\r\n"
      + "494,157 -> 494,159 -> 491,159 -> 491,167 -> 503,167 -> 503,159 -> 499,159 -> 499,157\r\n"
      + "497,154 -> 501,154\r\n"
      + "508,62 -> 508,56 -> 508,62 -> 510,62 -> 510,52 -> 510,62 -> 512,62 -> 512,60 -> 512,62 -> 514,62 -> 514,58 -> 514,62 -> 516,62 -> 516,55 -> 516,62\r\n"
      + "523,80 -> 527,80\r\n"
      + "512,139 -> 512,142 -> 509,142 -> 509,145 -> 521,145 -> 521,142 -> 517,142 -> 517,139\r\n"
      + "505,17 -> 510,17\r\n"
      + "510,104 -> 510,96 -> 510,104 -> 512,104 -> 512,101 -> 512,104 -> 514,104 -> 514,100 -> 514,104 -> 516,104 -> 516,103 -> 516,104\r\n"
      + "498,17 -> 503,17\r\n"
      + "512,122 -> 512,118 -> 512,122 -> 514,122 -> 514,120 -> 514,122 -> 516,122 -> 516,121 -> 516,122\r\n"
      + "512,139 -> 512,142 -> 509,142 -> 509,145 -> 521,145 -> 521,142 -> 517,142 -> 517,139\r\n"
      + "494,157 -> 494,159 -> 491,159 -> 491,167 -> 503,167 -> 503,159 -> 499,159 -> 499,157\r\n"
      + "516,125 -> 516,129 -> 515,129 -> 515,136 -> 526,136 -> 526,129 -> 519,129 -> 519,125\r\n"
      + "510,104 -> 510,96 -> 510,104 -> 512,104 -> 512,101 -> 512,104 -> 514,104 -> 514,100 -> 514,104 -> 516,104 -> 516,103 -> 516,104\r\n"
      + "516,125 -> 516,129 -> 515,129 -> 515,136 -> 526,136 -> 526,129 -> 519,129 -> 519,125\r\n"
      + "509,31 -> 509,32 -> 513,32 -> 513,31\r\n"
      + "504,90 -> 504,91 -> 513,91 -> 513,90\r\n"
      + "493,48 -> 493,49 -> 512,49 -> 512,48\r\n"
      + "479,26 -> 483,26\r\n"
      + "488,24 -> 492,24\r\n"
      + "512,152 -> 516,152\r\n"
      + "491,26 -> 495,26\r\n"
      + "493,48 -> 493,49 -> 512,49 -> 512,48\r\n"
      + "503,45 -> 503,41 -> 503,45 -> 505,45 -> 505,43 -> 505,45 -> 507,45 -> 507,37 -> 507,45 -> 509,45 -> 509,35 -> 509,45 -> 511,45 -> 511,37 -> 511,45\r\n"
      + "512,122 -> 512,118 -> 512,122 -> 514,122 -> 514,120 -> 514,122 -> 516,122 -> 516,121 -> 516,122\r\n"
      + "517,80 -> 521,80\r\n"
      + "510,104 -> 510,96 -> 510,104 -> 512,104 -> 512,101 -> 512,104 -> 514,104 -> 514,100 -> 514,104 -> 516,104 -> 516,103 -> 516,104\r\n"
      + "503,45 -> 503,41 -> 503,45 -> 505,45 -> 505,43 -> 505,45 -> 507,45 -> 507,37 -> 507,45 -> 509,45 -> 509,35 -> 509,45 -> 511,45 -> 511,37 -> 511,45\r\n"
      + "508,62 -> 508,56 -> 508,62 -> 510,62 -> 510,52 -> 510,62 -> 512,62 -> 512,60 -> 512,62 -> 514,62 -> 514,58 -> 514,62 -> 516,62 -> 516,55 -> 516,62\r\n"
      + "494,157 -> 494,159 -> 491,159 -> 491,167 -> 503,167 -> 503,159 -> 499,159 -> 499,157\r\n"
      + "514,83 -> 518,83\r\n"
      + "510,104 -> 510,96 -> 510,104 -> 512,104 -> 512,101 -> 512,104 -> 514,104 -> 514,100 -> 514,104 -> 516,104 -> 516,103 -> 516,104\r\n"
      + "510,104 -> 510,96 -> 510,104 -> 512,104 -> 512,101 -> 512,104 -> 514,104 -> 514,100 -> 514,104 -> 516,104 -> 516,103 -> 516,104\r\n"
      + "529,86 -> 533,86\r\n"
      + "526,83 -> 530,83\r\n"
      + "497,13 -> 502,13\r\n"
      + "516,108 -> 516,109 -> 520,109 -> 520,108\r\n"
      + "512,139 -> 512,142 -> 509,142 -> 509,145 -> 521,145 -> 521,142 -> 517,142 -> 517,139\r\n"
      + "516,125 -> 516,129 -> 515,129 -> 515,136 -> 526,136 -> 526,129 -> 519,129 -> 519,125\r\n"
      + "508,62 -> 508,56 -> 508,62 -> 510,62 -> 510,52 -> 510,62 -> 512,62 -> 512,60 -> 512,62 -> 514,62 -> 514,58 -> 514,62 -> 516,62 -> 516,55 -> 516,62\r\n"
      + "503,154 -> 507,154\r\n"
      + "494,15 -> 499,15\r\n"
      + "520,77 -> 524,77\r\n"
      + "506,152 -> 510,152\r\n"
      + "516,65 -> 516,69 -> 508,69 -> 508,74 -> 521,74 -> 521,69 -> 520,69 -> 520,65\r\n"
      + "516,65 -> 516,69 -> 508,69 -> 508,74 -> 521,74 -> 521,69 -> 520,69 -> 520,65\r\n"
      + "503,45 -> 503,41 -> 503,45 -> 505,45 -> 505,43 -> 505,45 -> 507,45 -> 507,37 -> 507,45 -> 509,45 -> 509,35 -> 509,45 -> 511,45 -> 511,37 -> 511,45\r\n"
      + "494,157 -> 494,159 -> 491,159 -> 491,167 -> 503,167 -> 503,159 -> 499,159 -> 499,157\r\n"
      + "512,139 -> 512,142 -> 509,142 -> 509,145 -> 521,145 -> 521,142 -> 517,142 -> 517,139\r\n"
      + "508,62 -> 508,56 -> 508,62 -> 510,62 -> 510,52 -> 510,62 -> 512,62 -> 512,60 -> 512,62 -> 514,62 -> 514,58 -> 514,62 -> 516,62 -> 516,55 -> 516,62\r\n"
      + "493,48 -> 493,49 -> 512,49 -> 512,48\r\n"
      + "510,104 -> 510,96 -> 510,104 -> 512,104 -> 512,101 -> 512,104 -> 514,104 -> 514,100 -> 514,104 -> 516,104 -> 516,103 -> 516,104\r\n"
      + "516,108 -> 516,109 -> 520,109 -> 520,108\r\n"
      + "512,122 -> 512,118 -> 512,122 -> 514,122 -> 514,120 -> 514,122 -> 516,122 -> 516,121 -> 516,122\r\n"
      + "508,62 -> 508,56 -> 508,62 -> 510,62 -> 510,52 -> 510,62 -> 512,62 -> 512,60 -> 512,62 -> 514,62 -> 514,58 -> 514,62 -> 516,62 -> 516,55 -> 516,62\r\n"
      + "503,45 -> 503,41 -> 503,45 -> 505,45 -> 505,43 -> 505,45 -> 507,45 -> 507,37 -> 507,45 -> 509,45 -> 509,35 -> 509,45 -> 511,45 -> 511,37 -> 511,45\r\n"
      + "503,45 -> 503,41 -> 503,45 -> 505,45 -> 505,43 -> 505,45 -> 507,45 -> 507,37 -> 507,45 -> 509,45 -> 509,35 -> 509,45 -> 511,45 -> 511,37 -> 511,45\r\n"
      + "508,62 -> 508,56 -> 508,62 -> 510,62 -> 510,52 -> 510,62 -> 512,62 -> 512,60 -> 512,62 -> 514,62 -> 514,58 -> 514,62 -> 516,62 -> 516,55 -> 516,62\r\n"
      + "508,62 -> 508,56 -> 508,62 -> 510,62 -> 510,52 -> 510,62 -> 512,62 -> 512,60 -> 512,62 -> 514,62 -> 514,58 -> 514,62 -> 516,62 -> 516,55 -> 516,62\r\n"
      + "508,62 -> 508,56 -> 508,62 -> 510,62 -> 510,52 -> 510,62 -> 512,62 -> 512,60 -> 512,62 -> 514,62 -> 514,58 -> 514,62 -> 516,62 -> 516,55 -> 516,62\r\n"
      + "488,20 -> 492,20\r\n"
      + "500,152 -> 504,152\r\n"
      + "509,31 -> 509,32 -> 513,32 -> 513,31\r\n"
      + "509,154 -> 513,154\r\n"
      + "503,45 -> 503,41 -> 503,45 -> 505,45 -> 505,43 -> 505,45 -> 507,45 -> 507,37 -> 507,45 -> 509,45 -> 509,35 -> 509,45 -> 511,45 -> 511,37 -> 511,45\r\n"
      + "508,62 -> 508,56 -> 508,62 -> 510,62 -> 510,52 -> 510,62 -> 512,62 -> 512,60 -> 512,62 -> 514,62 -> 514,58 -> 514,62 -> 516,62 -> 516,55 -> 516,62\r\n"
      + "516,125 -> 516,129 -> 515,129 -> 515,136 -> 526,136 -> 526,129 -> 519,129 -> 519,125\r\n"
      + "523,86 -> 527,86\r\n"
      + "516,125 -> 516,129 -> 515,129 -> 515,136 -> 526,136 -> 526,129 -> 519,129 -> 519,125\r\n"
      + "491,22 -> 495,22\r\n"
      + "497,26 -> 501,26\r\n"
      + "506,148 -> 510,148\r\n"
      + "516,65 -> 516,69 -> 508,69 -> 508,74 -> 521,74 -> 521,69 -> 520,69 -> 520,65\r\n"
      + "512,122 -> 512,118 -> 512,122 -> 514,122 -> 514,120 -> 514,122 -> 516,122 -> 516,121 -> 516,122\r\n"
      + "503,45 -> 503,41 -> 503,45 -> 505,45 -> 505,43 -> 505,45 -> 507,45 -> 507,37 -> 507,45 -> 509,45 -> 509,35 -> 509,45 -> 511,45 -> 511,37 -> 511,45\r\n"
      + "510,104 -> 510,96 -> 510,104 -> 512,104 -> 512,101 -> 512,104 -> 514,104 -> 514,100 -> 514,104 -> 516,104 -> 516,103 -> 516,104\r\n"
      + "510,104 -> 510,96 -> 510,104 -> 512,104 -> 512,101 -> 512,104 -> 514,104 -> 514,100 -> 514,104 -> 516,104 -> 516,103 -> 516,104\r\n"
      + "503,45 -> 503,41 -> 503,45 -> 505,45 -> 505,43 -> 505,45 -> 507,45 -> 507,37 -> 507,45 -> 509,45 -> 509,35 -> 509,45 -> 511,45 -> 511,37 -> 511,45\r\n"
      + "508,62 -> 508,56 -> 508,62 -> 510,62 -> 510,52 -> 510,62 -> 512,62 -> 512,60 -> 512,62 -> 514,62 -> 514,58 -> 514,62 -> 516,62 -> 516,55 -> 516,62\r\n"
      + "494,157 -> 494,159 -> 491,159 -> 491,167 -> 503,167 -> 503,159 -> 499,159 -> 499,157\r\n"
      + "516,108 -> 516,109 -> 520,109 -> 520,108\r\n"
      + "501,15 -> 506,15\r\n"
      + "516,125 -> 516,129 -> 515,129 -> 515,136 -> 526,136 -> 526,129 -> 519,129 -> 519,125\r\n"
      + "491,17 -> 496,17\r\n"
      + "516,65 -> 516,69 -> 508,69 -> 508,74 -> 521,74 -> 521,69 -> 520,69 -> 520,65\r\n"
      + "508,62 -> 508,56 -> 508,62 -> 510,62 -> 510,52 -> 510,62 -> 512,62 -> 512,60 -> 512,62 -> 514,62 -> 514,58 -> 514,62 -> 516,62 -> 516,55 -> 516,62\r\n"
      + "512,122 -> 512,118 -> 512,122 -> 514,122 -> 514,120 -> 514,122 -> 516,122 -> 516,121 -> 516,122\r\n"
      + "512,139 -> 512,142 -> 509,142 -> 509,145 -> 521,145 -> 521,142 -> 517,142 -> 517,139\r\n"
      + "504,90 -> 504,91 -> 513,91 -> 513,90\r\n"
      + "503,45 -> 503,41 -> 503,45 -> 505,45 -> 505,43 -> 505,45 -> 507,45 -> 507,37 -> 507,45 -> 509,45 -> 509,35 -> 509,45 -> 511,45 -> 511,37 -> 511,45\r\n"
      + "508,62 -> 508,56 -> 508,62 -> 510,62 -> 510,52 -> 510,62 -> 512,62 -> 512,60 -> 512,62 -> 514,62 -> 514,58 -> 514,62 -> 516,62 -> 516,55 -> 516,62\r\n"
      + "482,24 -> 486,24\r\n"
      + "510,104 -> 510,96 -> 510,104 -> 512,104 -> 512,101 -> 512,104 -> 514,104 -> 514,100 -> 514,104 -> 516,104 -> 516,103 -> 516,104\r\n"
      + "509,31 -> 509,32 -> 513,32 -> 513,31\r\n"
      + "516,65 -> 516,69 -> 508,69 -> 508,74 -> 521,74 -> 521,69 -> 520,69 -> 520,65\r\n"
      + "512,122 -> 512,118 -> 512,122 -> 514,122 -> 514,120 -> 514,122 -> 516,122 -> 516,121 -> 516,122\r\n"
      + "515,154 -> 519,154\r\n"
      + "517,86 -> 521,86\r\n"
      + "485,26 -> 489,26\r\n"
      + "504,90 -> 504,91 -> 513,91 -> 513,90\r\n"
      + "510,104 -> 510,96 -> 510,104 -> 512,104 -> 512,101 -> 512,104 -> 514,104 -> 514,100 -> 514,104 -> 516,104 -> 516,103 -> 516,104\r\n"
      + "510,104 -> 510,96 -> 510,104 -> 512,104 -> 512,101 -> 512,104 -> 514,104 -> 514,100 -> 514,104 -> 516,104 -> 516,103 -> 516,104\r\n"
      + "503,150 -> 507,150\r\n"
      + "520,83 -> 524,83\r\n"
      + "508,62 -> 508,56 -> 508,62 -> 510,62 -> 510,52 -> 510,62 -> 512,62 -> 512,60 -> 512,62 -> 514,62 -> 514,58 -> 514,62 -> 516,62 -> 516,55 -> 516,62";
}
