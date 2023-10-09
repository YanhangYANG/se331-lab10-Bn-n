package se331.lab.rest.util;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import se331.lab.rest.entity.AuctionItem;
import se331.lab.rest.entity.AuctionItemDTO;
import se331.lab.rest.entity.Bid;
import se331.lab.rest.entity.BidDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-29T15:10:33+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18 (Oracle Corporation)"
)
public class LabMapperImpl implements LabMapper {

    @Override
    public AuctionItemDTO getAuctionItemDto(AuctionItem auctionItem) {
        if ( auctionItem == null ) {
            return null;
        }

        AuctionItemDTO.AuctionItemDTOBuilder auctionItemDTO = AuctionItemDTO.builder();

        auctionItemDTO.id( auctionItem.getId() );
        auctionItemDTO.description( auctionItem.getDescription() );
        auctionItemDTO.type( auctionItem.getType() );
        auctionItemDTO.bids( getBidDTO( auctionItem.getBids() ) );
        auctionItemDTO.successfulBid( getBidDTO( auctionItem.getSuccessfulBid() ) );

        return auctionItemDTO.build();
    }

    @Override
    public List<AuctionItemDTO> getAuctionItemDto(List<AuctionItem> auctionItems) {
        if ( auctionItems == null ) {
            return null;
        }

        List<AuctionItemDTO> list = new ArrayList<AuctionItemDTO>( auctionItems.size() );
        for ( AuctionItem auctionItem : auctionItems ) {
            list.add( getAuctionItemDto( auctionItem ) );
        }

        return list;
    }

    @Override
    public BidDTO getBidDTO(Bid bid) {
        if ( bid == null ) {
            return null;
        }

        BidDTO.BidDTOBuilder bidDTO = BidDTO.builder();

        bidDTO.id( bid.getId() );
        bidDTO.amount( bid.getAmount() );
        bidDTO.datetime( bid.getDatetime() );

        return bidDTO.build();
    }

    @Override
    public List<BidDTO> getBidDTO(List<Bid> bids) {
        if ( bids == null ) {
            return null;
        }

        List<BidDTO> list = new ArrayList<BidDTO>( bids.size() );
        for ( Bid bid : bids ) {
            list.add( getBidDTO( bid ) );
        }

        return list;
    }
}
