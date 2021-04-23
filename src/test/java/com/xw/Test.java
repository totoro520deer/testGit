package com.xw;

public class Test {


    public static int table_hash(String str){
        return Long.valueOf(Math.abs(BKDRHash(str)%10)).intValue();
    }


    public static long BKDRHash(String str)
    {
        long seed = 131; // 31 131 1313 13131 131313 etc..
        long hash = 0;
        for(int i = 0; i < str.length(); i++)
        {
            hash = (hash * seed) + str.charAt(i);
        }
        return hash;
    }
    public static void main(String[] args) {

        String str = "oxqO71M8JzzaEPvdybbbWP4OFNAM";
        System.out.println(table_hash(str));

		/*String[] strs = {
				"ovF9atzFMfzBEcWjcDTunSKeFVVk",
				"ovF9atzLM5_VC_jtT_GEypM_opqI",
				"ovF9atyFpOKHoL7MRTyuB5di012Y",
				"ovF9atwCdLTfe-FjBn0AgF0XFB-I",
				"ovF9atwNW_O9BnFMYQzKTHQESg4U",
				"ovF9at6khu0O9kUXTb8aAHLgmFKs",
				"ovF9at-fKhYZjzTAuVBQcBOsXSCA",
				"ovF9atxjJLs_rsh41x0aAfQagb38",
				"ovF9at9qAhAIknZ_4OkC7kSK9rTw",
				"ovF9at2hxF59UPsB2-mElzHqmEcM",
				"ovF9at-21_YxpyPAw8xI20Hli4dQ",
				"ovF9atzJNp5Doyd2YyTrXaSPsr0k",
				"ovF9at2dNR34b2ErgS2kdbh4E-as",
				"ovF9at_rj7wJSmg960TrWpkR1Sbk",
				"ovF9at74ThnpagN2b4XR73DIHGP4",
				"ovF9atyAjbpv4wlfFNgic1M1hNKI",
				"ovF9atxAlJBwmywP21d2XfpXm9rw",
				"ovF9at83SJwvTHR3ggpVsFB1UGvI",
				"ovF9at05TVLrhVohMlefZXEoSnnQ",
				"ovF9at9EnnKQGDFbS4g-d8ygf0JY",
				"ovF9atxf2eVM4ws9qalJRQSAsvLc",
				"ovF9at-wK_eFrZcqSQW1IcrbgR-A",
				"ovF9atzNOoJo7ZXb-0d3ivP_EJjE",
				"ovF9atx5if289iePAAo911PDphSI",
				"ovF9atyHx_cmXVetc5nPkpDCKfS8",
				"ovF9atxR72bm27d8t-UUffKgQ1fE",
				"ovF9atyJSeNHhhPx9Pnn5xHWlJ84",
				"ovF9atzSWEXMyzm63i_AO6YRlOEQ",
				"ovF9at5kCEeWqt8NSUTSLsJ5YTCE",
				"ovF9at87Wvq9WIuIHZRHQ2UxQZOc",
				"ovF9atz0srfAdpAnAi-Mqp_74S3Y",
				"ovF9at3n0hAOuNTAjSWVC7zR5P4Q",
				"ovF9at6RgF95QF1wyHkpRauKiIOA",
				"ovF9at38ecyH2UKYZ7czfl2gNs2M",
				"ovF9at56sSKRwGvrM-73CxEuo2hk",
				"ovF9atxlWi7OpATpWBZO5uFqGDCE",
				"ovF9at_xunTqRG4EIurHz5S8e4vI",
				"ovF9at6vSjUo0gGENv14D-W_WHT0",
				"ovF9at53eXs9kOIsmtHLs7GBy8WM",
				"ovF9at3z7Ycrd70_HgFA8GMrGUDM",
				"ovF9at9M3X0bR_XmXomstXEpOW-Y",
				"ovF9atxsEHnYmnldjOgPh9D_Fthc",
				"ovF9at7XMAQyxyA4sPX1h1NXRSsE",
				"ovF9at6WVJQA1EAfCCtJE2KACXGY",
				"ovF9atwJt8SJq70nnr_RflbVO6Yk",
				"ovF9at9YrBoWvv3DjljGvmoLj4I4",
				"ovF9at-_GE8tGomERe_rePphvXBw",
				"ovF9at1m0Vpg9ovpCMHiTmtFNuLM",
				"ovF9at8a21LCpEIJ2UdcnUO1JSi8",
				"ovF9at2NAxFG8z5ckd9ayLexfXzs",
				"ovF9at5dD-ayE6l-5YF4JwZzYEws",
				"ovF9atyi8XBP530iM5bk_BVlSG_Q",
				"ovF9at9fDLhCEBFeqrOUCYW9hOU4",
				"ovF9at_EDea7dPPA-0ZnOxg2b_70",
				"ovF9at2XcmHy_z2k-mjZlRiJdSWQ",
				"ovF9at7Ee_5VqysCQzOYtZ7LEUO0",
				"ovF9atz1YIjYK2Zpj0g2DNLVZ624",
				"ovF9at6t2sOirhuyj_5SRK4qRNW0",
				"ovF9at0oYU3bSMSmK4sq5BFLpqLI",
				"ovF9at6uGDQaoYWt5KxtlegCNbSg",
				"ovF9at6RFTkq6bnNifdr7LFcvt5I",
				"ovF9at-l_V7SmhEGoujfNLjXmBSw",
				"ovF9at7YU_gRHCamIBGZse7fqbHk",
				"ovF9at1tbnNxxcWOgtx0X7i879JU",
				"ovF9at8ebuHAuZVCS05Tn-w4UbVI",
				"ovF9at27PWs-SJX2NuVF8dA2sjGI",
				"ovF9at-VeOdG8IShUy_aM5-T28cM",
				"ovF9atzOqoJCUJ2qWMFgr_wCW5vw",
				"ovF9at6Bm5Zqg_B2BlYk0ftn4AjY",
				"ovF9at4ZZFOM0pZ97hQ7lH-yVSkc",
				"ovF9at1tpgte_7e2d9Fc0MsWtiEo",
				"ovF9at4qw7lQXwxB44kmdJAQhhJg",
				"ovF9at4wjLW2KgJqbGN_0CpRSz04",
				"ovF9at67z2n9791xWwi8wIuEHajk",
				"ovF9atz35LtzamNzK0vkCR4LQOcM",
				"ovF9at0UiqYVVyLRpW0P968jkRzY",
				"ovF9at2FuOgAPW9llJIG4Hdjicjc"
		};
		int num = 0;
		int score_id = 9;
		for(String str:strs) {
			if(table_hash(str)==score_id) {
				System.out.println("'"+str+"',");
				num++;
				//System.out.println(str+" "+table_hash(str));
			}
		}
		System.out.println("score_id = "+score_id+" num = "+num);*/

    }
}
