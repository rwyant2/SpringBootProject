package hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.hamcrest.Matchers.containsString;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class Html5Test {

    @Autowired
    private MockMvc mockMvc;
    
    @Test // "fun" is somewhere on the page
    public void html5Contains() throws Exception {
    	mockMvc.perform(get("/html5"))
    		.andExpect(status().isOk())
    		.andExpect(content().string(containsString("fun")));
    }
    

}
