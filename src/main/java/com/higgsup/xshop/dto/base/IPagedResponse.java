package com.higgsup.xshop.dto.base;

import lombok.Data;

@Data
public class IPagedResponse<T> {
  private ResponseMessage<T> responseMessage;
  private int totalItem;
  private int pageIndex;
  private int pageSize;
}