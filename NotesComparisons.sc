NotesComparisons {
	var note, post;

    //class methods	

	*new { | note = 0| 
		^super.newCopyArgs(note).init;
	
	}
	
	//instance methods	

	init {
		//if (note.isNil) { note = 0; }; 
		^this.makePost;
	}
	
	makePost {
				~notescomp = NetAddr("localhost", 12345);
		^post = { 
	
					
			NotesData.load;
			

//1st octave	(abs sto postln tou current freq)
	
			if (note <= 33 )  
			  { if (note >= 31) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: C_1").post; (" RightFreq : ").post; ~c_1.postln; note = ~c_1; /*~aw.sendMsg("/pare", note.asInteger);*/};
			    
	         };

			
			if (note <= 35 )  
			  { if (note >= 33.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: C#1").post; (" RightFreq : ").post; ~cD1.postln; note = ~cD1; /*~aw.sendMsg("/pare", note.asInteger);*/};	 
	         };

	
			if (note <= 37 )  
			  { if (note >= 35.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: D_1").post; (" RightFreq : ").post; ~d_1.postln; note = ~d_1;};	 
	         };

			if (note <= 39.9 )  
			  { if (note >= 37.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: D#1").post; (" RightFreq : ").post; ~dD1.postln; note = ~dD1;};	 
	         };

			
			if (note <= 42 )  
			  { if (note >= 40) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: E_1").post; (" RightFreq : ").post; ~e_1.postln; note = ~e_1;};	 
	         };

	
			if (note <= 44.5 )  
			  { if (note >= 42.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: F_1").post; (" RightFreq : ").post; ~f_1.postln; note = ~f_1;};	 
	         };



			if (note <= 47 )  
			  { if (note >= 44.6) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: F#1").post; (" RightFreq : ").post; ~fD1.postln; note = ~fD1;};	 
	         };

			
			if (note <= 50 )  
			  { if (note >= 47.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: G_1").post; (" RightFreq : ").post; ~g_1.postln; note = ~g_1;};	 
	         };

	
			if (note <= 53 )  
			  { if (note >= 50.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: G#1").post; (" RightFreq : ").post; ~gD1.postln; note = ~gD1;};	 
	         };

			if (note <= 57 )  
			  { if (note >= 53.01) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: A_1").post; (" RightFreq : ").post; ~a_1.postln; note = ~a_1;};	 
	         };

			
			if (note <= 59 )  
			  { if (note >= 57.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: A#1").post; (" RightFreq : ").post; ~aD1.postln; note = ~aD1;};	 
	         };

	
			if (note <= 63 )  
			  { if (note >= 59.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: B_1").post; (" RightFreq : ").post; ~b_1.postln; note = ~b_1;};	 
	         };
	         
		

//2nd octave			
			
			
			if (note <= 67 )  
			  { if (note >= 63.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: C_2").post; (" RightFreq : ").post; ~c_2.postln; note = ~c_2;};	 
	         };

			
			if (note <= 72 )  
			  { if (note >= 67.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: C#2").post; (" RightFreq : ").post; ~cD2.postln; note = ~cD2;};	 
	         };

			if (note <= 75 )  
			  { if (note >= 72.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: D_2").post; (" RightFreq : ").post; ~d_2.postln; note = ~d_2;};	 
	         };

			if (note <= 79 )  
			  { if (note >= 75.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: D#2").post; (" RightFreq : ").post; ~dD2.postln; note = ~dD2;};	 
	         };

			
			if (note <= 85 )  
			  { if (note >= 79.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: E_2").post; (" RightFreq : ").post; ~e_2.postln; note = ~e_2;};	 
	         };

	
			if (note <= 89 )  
			  { if (note >= 85.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: F_2").post; (" RightFreq : ").post; ~f_2.postln; note = ~f_2;};	 
	         };



			if (note <= 94 )  
			  { if (note >= 89.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: F#2").post; (" RightFreq : ").post; ~fD2.postln; note = ~fD2;};	 
	         };

			
			if (note <= 100 )  
			  { if (note >= 94.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: G_2").post; (" RightFreq : ").post; ~g_2.postln; note = ~g_2;};	 
	         };

	
			if (note <= 105 )  
			  { if (note >= 100.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: G#2").post; (" RightFreq : ").post; ~gD2.postln; note = ~gD2;};	 
	         };

			if (note <= 112 )  
			  { if (note >= 105.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: A_2").post; (" RightFreq : ").post; ~a_2.postln; note = ~a_2;};	 
	         };

			
			if (note <= 118 )  
			  { if (note >= 112) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: A#2").post; (" RightFreq : ").post; ~aD2.postln; note = ~aD2;};	 
	         };

	
			if (note <= 125 )  
			  { if (note >= 118.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: B_2").post; (" RightFreq : ").post; ~b_2.postln; note = ~b_2;};	 
	         };
	
//3rd octave


			if (note <= 135 )  
			  { if (note >= 125.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: C_3").post; (" RightFreq : ").post; ~c_3.postln; note = ~c_3;};	 
	         };

			
			if (note <= 144 )  
			  { if (note >= 135.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: C#3").post; (" RightFreq : ").post; ~cD3.postln; note = ~cD3;};	 
	         };

			if (note <= 150 )  
			  { if (note >= 144.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: D_3").post; (" RightFreq : ").post; ~d_3.postln; note = ~d_3;};	 
	         };

			if (note <= 160 )  
			  { if (note >= 150.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: D#3").post; (" RightFreq : ").post; ~dD3.postln; note = ~dD3;};	 
	         };

			
			if (note <= 170 )  
			  { if (note >= 160.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: E_3").post; (" RightFreq : ").post; ~e_3.postln; note = ~e_3;};	 
	         };

	
			if (note <= 180 )  
			  { if (note >= 170.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: F_3").post; (" RightFreq : ").post; ~f_3.postln; note = ~f_3;};	 
	         };



			if (note <= 190 )  
			  { if (note >= 180.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: F#3").post; (" RightFreq : ").post; ~fD3.postln; note = ~fD3;};	 
	         };

			
			if (note <= 202 )  
			  { if (note >= 190.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: G_3").post; (" RightFreq : ").post; ~g_3.postln; note = ~g_3;};	 
	         };

	
			if (note <= 212 )  
			  { if (note >= 202.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: G#3").post; (" RightFreq : ").post; ~gD3.postln; note = ~gD3;};	 
	         };

			if (note <= 229 )  
			  { if (note >= 212.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: A_3").post; (" RightFreq : ").post; ~a_3.postln; note = ~a_3;};	 
	         };

			
			if (note <= 239 )  
			  { if (note >= 229.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: A#3").post; (" RightFreq : ").post; ~aD3.postln; note = ~aD3;};	 
	         };

	
			if (note <= 250 )  
			  { if (note >= 239.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: B_3").post; (" RightFreq : ").post; ~b_3.postln; note = ~b_3;};	 
	         };
		

//4th octave		
		
	
			if (note <= 273 )  
			  { if (note >= 250.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: C_4").post; (" RightFreq : ").post; ~c_4.postln; note = ~c_4;};	 
	         };

			
			if (note <= 285 )  
			  { if (note >= 273.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: C#4").post; (" RightFreq : ").post; ~cD4.postln; note = ~cD4;};	 
	         };

			if (note <= 300 )  
			  { if (note >= 285.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: D_4").post; (" RightFreq : ").post; ~d_4.postln; note = ~d_4;};	 
	         };

			if (note <= 315 )  
			  { if (note >= 300.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: D#4").post; (" RightFreq : ").post; ~dD4.postln; note = ~dD4;};	 
	         };

			
			if (note <= 339 )  
			  { if (note >= 315.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: E_4").post; (" RightFreq : ").post; ~e_4.postln; note = ~e_4;};	 
	         };

	
			if (note <= 359 )  
			  { if (note >= 339.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: F_4").post; (" RightFreq : ").post; ~f_4.postln; note = ~f_4;};	 
	         };



			if (note <= 379 )  
			  { if (note >= 359.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: F#4").post; (" RightFreq : ").post; ~fD4.postln; note = ~fD4;};	 
	         };

			
			if (note <= 400 )  
			  { if (note >= 379.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: G_4").post; (" RightFreq : ").post; ~g_4.postln; note = ~g_4;};	 
	         };

	
			if (note <= 425 )  
			  { if (note >= 400.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: G#4").post; (" RightFreq : ").post; ~gD4.postln; note = ~gD4;};	 
	         };

			if (note <= 450 )  
			  { if (note >= 425.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: A_4").post; (" RightFreq : ").post; ~a_4.postln; note = ~a_4;};	 
	         };

			
			if (note <= 477 )  
			  { if (note >= 450.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: A#4").post; (" RightFreq : ").post; ~aD4.postln; note = ~aD4;};	 
	         };

	
			if (note <= 500 )  
			  { if (note >= 477.1) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: B_4").post; (" RightFreq : ").post; ~b_4.postln; note = ~b_4;};	 
	         };	
	
	
//5th octave

			if (note <= 533 )  
			  { if (note >= 510) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: C_5").post; (" RightFreq : ").post; ~c_5.postln; note = ~c_5;};	 
	         };

			
			if (note <= 556 )  
			  { if (note >= 544) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: C#5").post; (" RightFreq : ").post; ~cD5.postln; note = ~cD5;};	 
	         };

			if (note <= 588 )  
			  { if (note >= 577) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: D_5").post; (" RightFreq : ").post; ~d_5.postln; note = ~d_5;};	 
	         };

			if (note <= 635 )  
			  { if (note >= 610) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: D#5").post; (" RightFreq : ").post; ~dD5.postln; note = ~dD5;};	 
	         };

			
			if (note <= 675 )  
			  { if (note >= 645) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: E_5").post; (" RightFreq : ").post; ~e_5.postln; note = ~e_5;};	 
	         };

	
			if (note <= 715 )  
			  { if (note >= 685) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: F_5").post; (" RightFreq : ").post; ~f_5.postln; note = ~f_5;};	 
	         };



			if (note <= 755 )  
			  { if (note >= 725) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: F#5").post; (" RightFreq : ").post; ~fD5.postln; note = ~fD5;};	 
	         };

			
			if (note <= 800 )  
			  { if (note >= 765) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: G_5").post; (" RightFreq : ").post; ~g_5.postln; note = ~g_5;};	 
	         };

	
			if (note <= 845 )  
			  { if (note >= 810) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: G#5").post; (" RightFreq : ").post; ~gD5.postln; note = ~gD5;};	 
	         };

			if (note <= 900 )  
			  { if (note >= 865) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: A_5").post; (" RightFreq : ").post; ~a_5.postln; note = ~a_5;};	 
	         };

			
			if (note <= 950 )  
			  { if (note >= 915) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: A#5").post; (" RightFreq : ").post; ~aD5.postln; note = ~aD5;};	 
	         };

	
			if (note <= 1000 )  
			  { if (note >= 965) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: B_5").post; (" RightFreq : ").post; ~b_5.postln; note = ~b_5;};	 
	         };		
		


//6th octave


			if (note <= 1050 )  
			  { if (note >= 1010) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: C_6").post; (" RightFreq : ").post; ~c_6.postln; note = ~c_6;};	 
	         };

			
			if (note <= 1130 )  
			  { if (note >= 1085) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: C#6").post; (" RightFreq : ").post; ~cD6.postln; note = ~cD6;};	 
	         };

			if (note <= 1200 )  
			  { if (note >= 1154) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: D_6").post; (" RightFreq : ").post; ~d_6.postln; note = ~d_6;};	 
	         };

			if (note <= 1260 )  
			  { if (note >= 1220) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: D#6").post; (" RightFreq : ").post; ~dD6.postln; note = ~dD6;};	 
	         };

			
			if (note <= 1340 )  
			  { if (note >= 1290) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: E_6").post; (" RightFreq : ").post; ~e_6.postln; note = ~e_6;};	 
	         };

	
			if (note <= 1440 )  
			  { if (note >= 1375) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: F_6").post; (" RightFreq : ").post; ~f_6.postln; note = ~f_6;};	 
	         };



			if (note <= 1510 )  
			  { if (note >= 1460) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: F#6").post; (" RightFreq : ").post; ~fD6.postln; note = ~fD6;};	 
	         };

			
			if (note <= 1580 )  
			  { if (note >= 1540) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: G_6").post; (" RightFreq : ").post; ~g_6.postln; note = ~g_6;};	 
	         };

	
			if (note <= 1680 )  
			  { if (note >= 1640) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: G#6").post; (" RightFreq : ").post; ~gD6.postln; note = ~gD6;};	 
	         };

			if (note <= 1780 )  
			  { if (note >= 1740) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: A_6").post; (" RightFreq : ").post; ~a_6.postln; note = ~a_6;};	 
	         };

			
			if (note <= 1880 )  
			  { if (note >= 1840) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: A#6").post; (" RightFreq : ").post; ~aD6.postln; note = ~aD6;};	 
	         };

	
			if (note <= 1990 )  
			  { if (note >= 1950) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: B_6").post; (" RightFreq : ").post; ~b_6.postln; note = ~b_6;};	 
	         };		
		
		
//7th octave


			if (note <= 2110 )  
			  { if (note >= 2070) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: C_7").post; (" RightFreq : ").post; ~c_7.postln; note = ~c_7;};	 
	         };

			
			if (note <= 2240 )  
			  { if (note >= 2195) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: C#7").post; (" RightFreq : ").post; ~cD7.postln; note = ~cD7;};	 
	         };

			if (note <= 2370 )  
			  { if (note >= 2330) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: D_7").post; (" RightFreq : ").post; ~d_7.postln; note = ~d_7;};	 
	         };

			if (note <= 2510 )  
			  { if (note >= 2465) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: D#7").post; (" RightFreq : ").post; ~dD7.postln; note = ~dD7;};	 
	         };

			
			if (note <= 2660 )  
			  { if (note >= 2615) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: E_7").post; (" RightFreq : ").post; ~e_7.postln; note = ~e_7;};	 
	         };

	
			if (note <= 2810 )  
			  { if (note >= 2765) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: F_7").post; (" RightFreq : ").post; ~f_7.postln; note = ~f_7;};	 
	         };



			if (note <= 2980 )  
			  { if (note >= 2935) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: F#7").post; (" RightFreq : ").post; ~fD7.postln; note = ~fD7;};	 
	         };

			
			if (note <= 3160 )  
			  { if (note >= 3115) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: G_7").post; (" RightFreq : ").post; ~g_7.postln; note = ~g_7;};	 
	         };

	
			if (note <= 3345 )  
			  { if (note >= 3300) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: G#7").post; (" RightFreq : ").post; ~gD7.postln; note = ~gD7;};	 
	         };

			if (note <= 3545 )  
			  { if (note >= 3500) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: A_7").post; (" RightFreq : ").post; ~a_7.postln; note = ~a_7;};	 
	         };

			
			if (note <= 3750 )  
			  { if (note >= 3705) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: A#7").post; (" RightFreq : ").post; ~aD7.postln; note = ~aD7;};	 
	         };

	
			if (note <= 3975 )  
			  { if (note >= 3920) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: B_7").post; (" RightFreq : ").post; ~b_7.postln; note = ~b_7;};	 
	         };		
		
		
//8th octave


			if (note <= 4210 )  
			  { if (note >= 4160) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: C_8").post; (" RightFreq : ").post; ~c_8.postln; note = ~c_8;};	 
	         };

			
			if (note <= 4455 )  
			  { if (note >= 4410) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: C#8").post; (" RightFreq : ").post; ~cD8.postln; note = ~cD8;};	 
	         };

			if (note <= 4715 )  
			  { if (note >= 4665) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: D_8").post; (" RightFreq : ").post; ~d_8.postln; note = ~d_8;};	 
	         };

			if (note <= 5000 )  
			  { if (note >= 4955) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: D#8").post; (" RightFreq : ").post; ~dD8.postln; note = ~dD8;};	 
	         };

			
			if (note <= 5300 )  
			  { if (note >= 5250) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: E_8").post; (" RightFreq : ").post; ~e_8.postln; note = ~e_8;};	 
	         };

	
			if (note <= 5615 )  
			  { if (note >= 5550) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: F_8").post; (" RightFreq : ").post; ~f_8.postln; note = ~f_8;};	 
	         };



			if (note <= 5950 )  
			  { if (note >= 5880) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: F#8").post; (" RightFreq : ").post; ~fD8.postln; note = ~fD8;};	 
	         };

			
			if (note <= 6300 )  
			  { if (note >= 6240) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: G_8").post; (" RightFreq : ").post; ~g_8.postln; note = ~g_8;};	 
	         };

	
			if (note <= 6660 )  
			  { if (note >= 6600) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: G#8").post; (" RightFreq : ").post; ~gD8.postln; note = ~gD8;};	 
	         };

			if (note <= 7080 )  
			  { if (note >= 7000) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: A_8").post; (" RightFreq : ").post; ~a_8.postln; note = ~a_8;};	 
	         };

			
			if (note <= 7550 )  
			  { if (note >= 7400) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: A#8").post; (" RightFreq : ").post; ~aD8.postln; note = ~aD8;};	 
	         };

	
			if (note <= 7980 )  
			  { if (note >= 7890) 
				 
			   { ("---------------CurrentFreq : ").post; note.post; (" NOTE: B_8").post; (" RightFreq : ").post; ~b_8.postln; note = ~b_8;};	 
	         };		
		
		//
		
		~notescomp.sendMsg("/take_freq", note.asInteger);
		
		("").post;
		
		
		   }.value
      }

}	





