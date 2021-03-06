package io.nuls.db.entity;

/**
 * @author Niels
 * @date 2017/11/20
 */
public class UtxoInputPo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column utxo_input.hash
     *
     * @mbg.generated
     */
    private String hash;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column utxo_input.tx_hash
     *
     * @mbg.generated
     */
    private String txHash;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column utxo_input.from_id
     *
     * @mbg.generated
     */
    private String fromId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column utxo_input.script
     *
     * @mbg.generated
     */
    private byte[] script;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column utxo_input.hash
     *
     * @return the value of utxo_input.hash
     *
     * @mbg.generated
     */
    public String getHash() {
        return hash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column utxo_input.hash
     *
     * @param hash the value for utxo_input.hash
     *
     * @mbg.generated
     */
    public void setHash(String hash) {
        this.hash = hash == null ? null : hash.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column utxo_input.tx_hash
     *
     * @return the value of utxo_input.tx_hash
     *
     * @mbg.generated
     */
    public String getTxHash() {
        return txHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column utxo_input.tx_hash
     *
     * @param txHash the value for utxo_input.tx_hash
     *
     * @mbg.generated
     */
    public void setTxHash(String txHash) {
        this.txHash = txHash == null ? null : txHash.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column utxo_input.from_id
     *
     * @return the value of utxo_input.from_id
     *
     * @mbg.generated
     */
    public String getFromId() {
        return fromId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column utxo_input.from_id
     *
     * @param fromId the value for utxo_input.from_id
     *
     * @mbg.generated
     */
    public void setFromId(String fromId) {
        this.fromId = fromId == null ? null : fromId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column utxo_input.script
     *
     * @return the value of utxo_input.script
     *
     * @mbg.generated
     */
    public byte[] getScript() {
        return script;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column utxo_input.script
     *
     * @param script the value for utxo_input.script
     *
     * @mbg.generated
     */
    public void setScript(byte[] script) {
        this.script = script;
    }
}