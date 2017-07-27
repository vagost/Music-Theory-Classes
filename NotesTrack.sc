NotesTrack {
        
        var in, ampthre = 0.02, clare = 0.1, rate = 10;
        var synth;
     
		
		*new { | in, ampthre = 0.02, clare = 0.1, rate = 10|
               ^super.newCopyArgs(in, ampthre, clare, rate).init;
        }
        
		init {
			   if (in.isNil) { in = { Mix.new(SoundIn.ar([0,1])); } };               
              ^this.makeSynth;
        }
        
        makeSynth {
				
				~trackresp.remove; 
				~trackresp = OSCresponder(nil, 'pitch', { | t, r, msg | 								msg[3].postln; NotesComparisons.new(msg[3]);
							}).add;
	
          
           ^synth = { | ampthre = 0.02, clare = 0.3, rate = 10 |
        
					var amp, freq, hasFreq;
			
						
						amp = Amplitude.kr(in.value, 0.01, 1);
						# freq, hasFreq = Pitch.kr(
								in.value, 
								ampThreshold: ampthre,
								//median: 7,
								clar: clare,
								peakThreshold: 0.5, 
								minFreq: 30,
								maxFreq: 10000,
								//downSample: 1,
								//maxBinsPerOctave: 10										
										);	
			 
					SendReply.kr(Impulse.kr(rate) * hasFreq, \pitch, freq, 100); 
			

        
           }.play(args: [\ampthre, ampthre, \clare, clare, \rate, rate])
        	
       }
        
}




//Examples
/*
	NotesTrack.new({SinOsc.ar(82)}, 0.1, 1, 1);
		NotesTrack.new({SinOsc.ar(32)}, 0.001);
			NotesTrack.new(nil, clare: 1, rate:2);
				Notes.hear

*/