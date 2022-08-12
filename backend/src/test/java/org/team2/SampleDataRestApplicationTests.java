//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = SampleDataRestApplication.class)
//@WebAppConfiguration
//@ActiveProfiles("scratch")
//// Separate profile for web tests to avoid clashing databases
//public class SampleDataRestApplicationTests {
//
//	@Autowired
//	private WebApplicationContext context;
//
//	private MockMvc mvc;
//
//	@Before
//	public void setUp() {
//		this.mvc = MockMvcBuilders.webAppContextSetup(this.context).build();
//	}
//
//	@Test
//	public void testHome() throws Exception {
//
//		this.mvc.perform(get("/")).andExpect(status().isOk())
//				.andExpect(content().string(containsString("restaurants")));
//	}
//}
