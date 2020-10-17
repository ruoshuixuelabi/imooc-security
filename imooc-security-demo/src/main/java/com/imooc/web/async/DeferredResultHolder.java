package com.imooc.web.async;
import java.util.HashMap;
import java.util.Map;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.async.DeferredResult;
/**
 * @author zhailiang
 */
@Component
@Data
public class DeferredResultHolder {
	private Map<String, DeferredResult<String>> map = new HashMap<>();
}