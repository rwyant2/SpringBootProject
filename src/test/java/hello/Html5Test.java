package hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class Html5Test {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void contextLoads() throws Exception {
    }
    
//    @Test
//    public void html5() throws Exception {
//        mockMvc.perform(get("/html5"))
//                .andExpect(content().string(containsString("fun")));
//    }
    
//    @Test
//    public void html5field() throws Exception {
//    	
//    }
}
