package com.itss.shops.repository;

import com.itss.shops.dto.ChiTietNhapHangDTO;

import java.util.List;

/**
 * Created by hungdd-cadpro on 29/06/2017.
 */
public interface ChiTietNhapHangRepositoryCustom {

    ChiTietNhapHangDTO addChiTietNhapHang(ChiTietNhapHangDTO chiTietNhapHangDTO);

    ChiTietNhapHangDTO updateChiTietNhapHang(ChiTietNhapHangDTO chiTietNhapHangDTO);

    Integer deleteChiTietNhapHang(Integer chiTietNhapHangID);

    ChiTietNhapHangDTO getChiTietNhapHangDTOById(Integer chiTietNhapHangID);

    List<ChiTietNhapHangDTO> getChiTietNhapHangDtosByPhieuNhapId(Integer phieuNhapId);
}
