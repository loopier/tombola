Tombola {
	*new { arg ...args;
		args.debug("Tombola");
		^super.new(args);
	}

	*ruleta{ arg ...livecoders;
		livecoders.debug("livecoders");
		Tdef(\ruleta, {
			100.do{|n|
				Post.clear;
				livecoders.scramble.do{|a,i| a.debug(i+1)};
				if (n == 99) {
					"LA COMBINACIÓN GANADORA!!!!".postln;
					// (finallist.size-offset-1).do{" ".postln};
					livecoders.size.do{" ".postln};
				} {
					livecoders.size.do{" ".postln};
				};
				((n+1)/250).wait;
			};
		}).play;
	}

	*clearpost { arg rows = 30;
		rows.do{" ".postln}
	}

	*musicamaestro { |path|
		Ndef(\tv, {
			var rate = \rate.kr(1);
			var tapemin = \tapemin.kr(0.96);// / XLine(1,2,);
			var tapemax = \tapemax.kr(1.04);
			var buf = Buffer.read(
				Server.default,
				(path = path ? Platform.userAppSupportDir++"/downloaded-quarks/tombola/sounds/wheeloffortune.wav").postln);
			// (Dust.ar(50) + PlayBuf.ar(2, b,rate:LFNoise2.ar(9).range(0.96,1.04), loop:1)) * (-12.dbamp)
			(Dust.ar(50) + PlayBuf.ar(2, buf,rate:LFNoise2.ar(9).range(tapemin,tapemax) * rate, loop:1)) * (-12.dbamp)
		}).play
	}

	*callate {
		Ndef(\tv).stop;
	}
}
