package cn.nvinfo.utils;

import java.util.List;

/**
 * ���ڷ�װ��ҳ��ģ��
 * @author Administrator
 * @param <E>
 *
 */
public class Pager<E> {
	
	/**
	 * �ܼ�¼��
	 */
	private int allCount;
	
	/**
	 * ÿҳ��ʾ�ļ�¼��
	 */
	private int pageSize;
	
	/**
	 * ��ҳ��
	 */
	private int pageCount;
	
	/**
	 * ��ǰҳ��ҳ��
	 */
	private int currPage;
	
	/**
	 * ��ǰҳ��ʾ������
	 */
	private List<E> datas;

	public int getAllCount() {
		return allCount;
	}

	public void setAllCount(int allCount) {
		this.allCount = allCount;
	}

	public int getPageCount() {
		return pageCount;
	}
    
	/**
	 * �����ҳ���ķ���
	 */
	public void setPageCount() {
		this.pageCount = this.allCount%this.pageSize==0?this.allCount/this.pageSize:(this.allCount/this.pageSize+1);
	}

	public int getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public List<E> getDatas() {
		return datas;
	}

	public void setDatas(List<E> datas) {
		this.datas = datas;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	

}