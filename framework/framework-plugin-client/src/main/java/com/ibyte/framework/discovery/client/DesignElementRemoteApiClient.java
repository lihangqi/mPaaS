package com.ibyte.framework.discovery.client;

import com.ibyte.framework.support.persistent.DesignElementRemoteApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 设计信息远程客户端
 *
 * @author <a href="mailto:shangzhi.ibyte@gmail.com">iByte</a>
 * @since 1.0.1
 */
@FeignClient(name = "${mpaas.svr.framework-plugin.app}", path = "/api/framework-discovery/designElement")
public interface DesignElementRemoteApiClient extends DesignElementRemoteApi {
}
