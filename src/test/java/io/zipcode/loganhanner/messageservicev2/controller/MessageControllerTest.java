package io.zipcode.loganhanner.messageservicev2.controller;

import io.zipcode.loganhanner.messageservicev2.MessageService;
import io.zipcode.loganhanner.messageservicev2.domain.Message;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@WebMvcTest(value = MessageController.class, secure = false)
public class MessageControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MessageService messageService;

    Message mockMessage = new Message(1, 1, 1, "04/20/1969 01:02:03", "This is a test.");

    @Test
    public void getAllByUser() {

    }

    @Test
    public void getMessage() throws Exception {
        Mockito.when(messageService.getMessage(Mockito.anyLong())).thenReturn(mockMessage);

        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("messages/1")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        String expected = "{}";

    }

    @Test
    public void createMessage() {
    }

    @Test
    public void updateMessage() {
    }

    @Test
    public void deleteMessage() {
    }
}