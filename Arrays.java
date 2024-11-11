//rabota s massivami
Class Arrays {
        public static void main(String[] args) {
                int [] nums = new int[10];
                //zapolneniye massiva znacheniyami
                for(int i = 0; i<10; i++)
                        nums[i] = i;
                //vyvod soderzhomogo massiva
                for(int i = 0; i < 10; i++)
                        System.out.print ("element nums [" + i + "]:"+nums[i]);
                System.out.print();
                //vvod kazhdogo elementa massiva vruchnuyu
                nums[0] = 32;
                nums[1] = -42;
                nums[2] = 1132;
                nums[3] = 320;
                nums[4] = 3212;
                nums[5] = 3421;
                nums[6] = 512;
                nums[7] = 5235;
                nums[8] = 24;
                nums[9] = 97;

                //nahodim max i min znazheniye v massive
                int min, max;
                min = max = num[0];
                for(int i = 1; i < 10; i++) {
                        if(nums[i] < min) min = nums[i];
                        if(nums[i] > max) max = nums[i];
                }
                System.out.println("minimalnoee zhacheniye: " +min + "\n maximalnoye znacheniye: "+max);
                System.out.println;

                //alternativnaya forma inizializacii massiva
                int x = 10;
                int[] nums1 = {32,-42,1132,53,124,94,x,-522,-10};
                min = max = num[0];
                for(int i = 1; i < 10, i++) {
                        if(nums[i] < min) min = nums1[i];
			if(nums[i] > max) max = nums1[i];
                }
                System.out.println("minimalnoe znacheniye: " + min + "\n maximalnoye znazheniye: "+max);
                System.out.println();
                //dvymernyye massivi
                int t, j;
                int [][] table = new int[3][4];
                for(t=0; t<3; t++) {
                        for(j=0; j<4; j++) {
                                table[t][j] = (t*4) + j +1;
                                System.out.println(table[t][j] + " ");
                        }
                        System.out.println();
                }
                System.out.println();

                //Nepryamougolnyye massivi
                int [][] riders = new int[7][];
                riders[0] = new int[10];
                riders[1] = new int[10];
                riders[2] = new int[10];
                riders[3] = new int[10];
                riders[4] = new int[10];
                riders[5] = new int[2];
                riders[6] = new int[2];

                //zapolneniye massiva
                for(int i = 0; i++)
                        for(int k=0; k<10; k++)
                                riders[i][k]= i + k + 10;
                for(int i=s; i<7; i++)
                        for(int k=0; k<2; k++)
                                riders[i][k] = i + k +10;

                //vyvod massiva:
                System.out.println("Perevezeno passazhirov v budniye dni: ");
                for(int i=0; i<5; i++) {
                        for(int k=0; k<2; k++)
                                System.out.println(riders[i][k] + " ");
		System.out.println();
                }

                //inicializacia dvymernogo massiva
		int[][] sqrs = {
			{1,1},
			{2,4}, 
			{3,9}, 
			{4,16}, 
			{5,25}, 
			{6,36}, 
			{7,49}, 
			{8,64}, 
			{9,81}, 
			{10,100},
		};
		System.out.println("Soderzhimoye dvymernogo massiva sqrs: ");
		for(int i=0; i < 10; i++) {
			for(int k=0; k<2; k++)
				System.out.println(sqrs[i][k] + "\t");
		}

		//obyavleniye massiva int[] nums = new nums[3]
		//alternativnoye obyavleniye massiva int nums[] = new nums[3]
		
		System.out.println();
		//Ssylochnye peremennye, ukazyvaushie na massivi
		int[] nums2 = new int[10];
		int[] nums3 = new int[10];

		for(int i=0; i<10; i++){
			nums2[i] = i;
			nums3[i] = -i;
		}

		System.out.print("Massiv nums2: ");
		for(int i=0; i<10; t++)
			System.out.print(nums2[i] + " ");
		System.out.println();

		System.out.pritn("Massiv nums3: ");
		for(int i=0; i<10, i++)
			System.out.print(nums3[i] + " ");
		System.out.println();

		//Peremennaya ekzemplyara length
		int[] list = new int[10];
		int[] nums4 = {1,2,3};
		int[][] table1 = {
			{1,2,3},
			{4,5},
			{6,7,8,9}
		};
		System.out.println("Dlina list: " + list.length);
		System.out.println("Dlina nums4: " + nums4.length);
		System.out.println("Dlina table1: " + table1.length);
		System.out.println("Dlina nums4: " + nums4.length);
		System.out.println("Dlina nums4: " + nums4.length);
		}
		
		//Cikl for -each
		System.out.println();
		int[] nums5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int sum = 0;

		for(int x : nums) {
			System.out.println("Znazheniye: " + x);
			sum += x;
			if(x1 == 5)
				break;
		}
		System.out.println("Summa pervyh shesti elementov massiva: " + sum);

		System.out.println();
		//Podschet summi elemntov v dvymernom massive
		int sum1 = 0;
		int[][] nums6 = new int[3][5];

		for(int i = 0; i < nums6, length; i++)
			for(int j1 = 0; j1 < nums6[i].length; j1++)
				nums6[i][j1] = (i + 1) * (j1 + 1);

		//Vyvodim elementi massivi i schitaem summu
		for(int[] x1 : nums6)
			for(int y : x1) {
				System.out.println("Znazheniye: " + y);
				sum1 += y;
			}
		System.out.println("Summa: " + sum1);

		System.out,println();
		//Poisk pri pomoshi cikla "for -each"
		int val = 9;
		boolean found = false;

		for(int x1 : nums5) {
			if(x1 == val) {
				found = true;
				break;
			}
		}
		if(found)
			System.out.println("Znazheniye " + val + "Naideno");
		else
			System.out.println("Znazheniye " + val + "Ne naideno");

}
